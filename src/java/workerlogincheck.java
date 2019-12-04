
import dbutil.CreateExcelFile;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/workerlogincheck"})
public class workerlogincheck extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet workerlogincheck</title>");            
            out.println("</head>");
            out.println("<body>");
            try
            {
                String username = request.getParameter("t1");
                String pass = request.getParameter("t2");
                workerreg r = new workerreg();
                CreateExcelFile x = new CreateExcelFile();
                if(r.workerlogincheck(username, pass))
                {
                    HttpSession session = request.getSession();
                    
                    session.setAttribute("name",r.getName());
                    session.setAttribute("aadhar",r.getAadhar());
                    session.setAttribute("dob",r.getDob());
                    session.setAttribute("pass",r.getPass());
                    session.setAttribute("mobile",r.getMobile());
                    session.setAttribute("state",r.getState());
                    session.setAttribute("city",r.getCity());
                    session.setAttribute("wardno",r.getWardno());
                    session.setAttribute("awcno",r.getAwcno());
                    
                      x.Fdetails();
                    response.sendRedirect("WorkerHome.jsp");
                }
                else
                {
                    out.println("Sorry UserName or Password Error!");
                    out.println("Do u want to recover the password<p>"
                            + "+<a href='Home.jsp'/a>forgot password</a");
                    RequestDispatcher rd=request.getRequestDispatcher("/workerlogin.jsp");
                    rd.include(request, response);
                }
                
                
            }
            catch(Exception ex)
            {
                out.println(ex);
            }
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
