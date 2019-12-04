package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dbutil.Benifisries;
import dbutil.DBConnect;

public final class submit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Submit</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       ");

           try
           {
               DBConnect x = new DBConnect();
               
              
        if(request.getParameter("b1")!=null)
              {
               String sql = "insert into regadolescent (name,aadhar,mothername,fathername,age,phone,address) values('"
                       +request.getParameter("t1")+"','"
                       +request.getParameter("t2")+"','"
                       +request.getParameter("t3")+"','"
                       +request.getParameter("t4")+"','"
                       +request.getParameter("t5")+"','"
                       +request.getParameter("t6")+"','"
                       +request.getParameter("t7")+"')";
                       
               System.out.println(sql);
                    x.queryExecuter(sql);
                    
                     out.println("<h2 align='center'>Record Saved Sucessfully</h2>"); 
                    
                   
                    RequestDispatcher rd=request.getRequestDispatcher("/AdolescentReg.jsp");
                    rd.include(request, response);
              } 
         
               if(request.getParameter("b2")!=null)
               {
               String sql = "insert into regwomen (name,aadhar,husbandname,mobile,address,pmonth) values('"
                       +request.getParameter("t1")+"','"
                       +request.getParameter("t2")+"','"
                       +request.getParameter("t3")+"','"
                       +request.getParameter("t4")+"','"
                       +request.getParameter("t5")+"','"
                       +request.getParameter("t6")+"')";
                       System.out.println(sql);
                    x.queryExecuter(sql);
                     out.println("<h2 align='center'>Record Saved Sucessfully</h2>"); 
                    
                   
                    RequestDispatcher rd=request.getRequestDispatcher("/PregnantR.jsp");
                    rd.include(request, response);
               }
            
                 if(request.getParameter("b3")!=null)
               {
                   
               String sql = "insert into regchild (name,aadhar,mothername,fathername,dobcertificate,address,gender,mobile,photo) values('"
                       +request.getParameter("t1")+"','"
                       +request.getParameter("t2")+"','"
                       +request.getParameter("t3")+"','"
                       +request.getParameter("t4")+"','"
                       +request.getParameter("t5")+"','"
                       +request.getParameter("t6")+"','"
                       +request.getParameter("t7")+"','"
                       +request.getParameter("t8")+"','"
                       +request.getParameter("t9")+"')";
                       System.out.println(sql);
                    x.queryExecuter(sql);
                       
                 
                 
                    out.println("<h2 align='center'>Record Saved Sucessfully</h2>"); 
                    
                   
                    RequestDispatcher rd=request.getRequestDispatcher("/ChildR.jsp");
                    rd.include(request, response);
                    
               }
                 
                 if(request.getParameter("a1")!=null)
                 {
                    String sql = "insert into admin values('"
                       +request.getParameter("t1")+"','"
                       +request.getParameter("t2")+"','"
                       +request.getParameter("t3")+"','"
                       +request.getParameter("t4")+"','"
                       +request.getParameter("t5")+"','"
                       +request.getParameter("t6")+"')";
                       System.out.println(sql);
                    x.queryExecuter(sql);
                    
                    System.out.println(sql);
                    
                    out.println("<h2 align='center'>Record Saved Sucessfully</h2>"); 
                    
                   
                    RequestDispatcher rd=request.getRequestDispatcher("/AdminR.jsp");
                    rd.include(request, response);
                 }
           }
           catch(Exception ex)
           {
               out.println(ex);
           }
           
           
            if(request.getParameter("n1")!=null) 
           {   
            try
            {
                DBConnect x = new DBConnect();
            String sql = "insert into image values('"+request.getParameter("t1")+
                    "','"+request.getParameter("t2")+"')";
            
            x.queryExecuter(sql);
                    }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
           }
       
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
