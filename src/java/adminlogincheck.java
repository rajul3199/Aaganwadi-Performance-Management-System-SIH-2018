/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

@WebServlet(urlPatterns = {"/adminlogincheck"})
public class adminlogincheck extends HttpServlet {
 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet adminlogincheck</title>");            
            out.println("</head>");
            out.println("<body>");
           try
            {
                String username = request.getParameter("t1");
                String pass = request.getParameter("t2");
                AdminReg r = new AdminReg();
                CreateExcelFile x = new CreateExcelFile();
               
                   
                if(r.adminlogincheck(username,pass))
                {
                    HttpSession session = request.getSession();
                    
                    session.setAttribute("name",r.getName());
                    session.setAttribute("aadhar",r.getAadhar());
                    
                    session.setAttribute("pass",r.getPass());
                    session.setAttribute("mobile",r.getMobile());
                    session.setAttribute("address",r.getAddress());
                     x.Start();
                    x.AdolescentGirl();
                    x.Mcheckup();
                    x.RegChild();
                    x.RegWomen();
                    x.WorkerReg();
                    x.Fdetails();
                    response.sendRedirect("AdminHome.jsp");
                }
                else
                {
                    out.println("Sorry UserName or Password Error!");
                    out.println("Do u want to recover the password<p>"
                            + "+<a href='forgot.jst'/a>forgot password</a");
                    RequestDispatcher rd=request.getRequestDispatcher("/adminlogin.jsp");
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
