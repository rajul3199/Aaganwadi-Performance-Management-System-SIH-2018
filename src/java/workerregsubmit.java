import dbutil.DBConnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/workerregsubmit"})
public class workerregsubmit extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet workerregsubmit</title>");            
            out.println("</head>");
            out.println("<body>");
            try{
                String name=request.getParameter("t1");
                String aadhar=request.getParameter("t2");
                String dob=request.getParameter("t3");
               // String photo=request.getParameter("t4");
                String username=request.getParameter("t4");
                String pass=request.getParameter("t5");
                String mobile=request.getParameter("t6");
                String state=request.getParameter("t7");
                String city=request.getParameter("t8");
                String wardno=request.getParameter("t9");
                String awcno=request.getParameter("t10");
                
                workerreg r=new workerreg();
                DBConnect x = new DBConnect();
                if(r.InsertReg(name,aadhar,dob,username,pass,mobile,state,city,wardno,awcno))
                {
                    
                    
                    
                    HttpSession session = request.getSession();
                    
                    session.setAttribute("name", name);
                    session.setAttribute("aadhar", aadhar);
                    session.setAttribute("dob", dob);
                    session.setAttribute("mobile",mobile);
                    session.setAttribute("state",state);
                    session.setAttribute("city",city);
                    session.setAttribute("wardno",wardno);
                    session.setAttribute("awcno",awcno);
                    
                    
                   out.println("<h2 align='center'>Record Saved Sucessfully</h2>");
                    
                    
                   response.sendRedirect("EmployeeReg.jsp");
                    
                }
                else
                {
                      out.println("Error");
                }
                     
                
                
            }
            catch(Exception ex){
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
