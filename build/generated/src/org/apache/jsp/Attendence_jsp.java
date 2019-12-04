package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Attendence_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Attendance</title>\n");
      out.write("        \n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("         <style>\n");
      out.write("        #m{\n");
      out.write("            box-shadow: 5px blue;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    <body background=\"m12.jpg\">\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "workerheader.jspf", out, false);
      out.write("\n");
      out.write("        <h2>Welcome Worker</h2>\n");
      out.write("        ");
      out.print(session.getAttribute("name"));
      out.write("\n");
      out.write("        \n");
      out.write("        <hr>\n");
      out.write("        <h2 align=\"center\">Attendance and Supplementary Nutrition</h2>\n");
      out.write("        \n");
      out.write("        ");

            try
        {
            if(session.getAttribute("name")==null)
            {
                response.sendRedirect("workerlogin.jsp");
            }
        }
            catch(Exception ex)
            {
                out.println(ex);
            }
        
        
      out.write("\n");
      out.write("        \n");
      out.write("   <form method=\"get\" action=\"check.jsp\" id=\"loginform\" class=\"form-horizontal\" role=\"form\">\n");
      out.write("\n");
      out.write("      \n");
      out.write("\n");
      out.write("        <div class=\"container\">    \n");
      out.write("            <div id=\"loginbox\" style=\"margin-top:50px;\" class=\"mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2\">                    \n");
      out.write("                <div class=\"panel panel-info\" >\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <div class=\"panel-title\">Attendance/Supplementary Nutrition</div>\n");
      out.write("                        <div style=\"float:right; font-size: 80%; position: relative; top:-10px\"><a href=\"#\"></a></div>\n");
      out.write("                    </div>     \n");
      out.write("\n");
      out.write("                    <div id=\"m\">\n");
      out.write("                    <div style=\"padding-top:30px\" class=\"panel-body\" >\n");
      out.write("\n");
      out.write("                        <div style=\"display:none\" id=\"login-alert\" class=\"alert alert-danger col-sm-12\"></div>\n");
      out.write("\n");
      out.write("                     \n");
      out.write("                           \n");
      out.write("\n");
      out.write("                            <div style=\"margin-bottom: 25px\">\n");
      out.write("                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-calendar\"></i></span>\n");
      out.write("                                <input id=\"login-password\" type=\"number\" class=\"form-control\" name=\"t1\" placeholder=\"AADHAR Number\">\n");
      out.write("                            </div>\n");
      out.write("                        \n");
      out.write("                        <h4>Food Details</h4>\n");
      out.write("                            \n");
      out.write("                            <div style=\"margin-bottom: 25px\">\n");
      out.write("                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-calendar\"></i></span>\n");
      out.write("                                <select id=\"login-password\" type=\"number\" class=\"form-control\" name=\"t2\" >\n");
      out.write("                                    <option>BreakFast</option>\n");
      out.write("                                    <option>Kichdi</option>\n");
      out.write("                                    <option>Halwa</option>\n");
      out.write("                                    <option>Kheer</option>\n");
      out.write("                                  \n");
      out.write("                                </select>\n");
      out.write("                            </div>        \n");
      out.write("                                <div style=\"margin-bottom: 25px\">\n");
      out.write("                                <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-calendar\"></i></span>\n");
      out.write("                                <select id=\"login-password\" type=\"number\" class=\"form-control\" name=\"t3\" >\n");
      out.write("                                    <option>MidDay Meal</option>\n");
      out.write("                               \n");
      out.write("                                    <option>Curry/Puri</option>\n");
      out.write("                                    <option>Rice/pulse</option>\n");
      out.write("                                </select>\n");
      out.write("                            </div>        \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("\n");
      out.write("                            <center>\n");
      out.write("                           \n");
      out.write("                                <!-- Button -->\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                                   <button type=\"submit\" name=\"s1\" value=\"submit\">Submit</button>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            </center>\n");
      out.write("                    </div>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>                     \n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        <footer class=\"w3-center w3-black w3-padding-64\">\n");
      out.write("\n");
      out.write("    <p><STRONG>Powered by CODESQUAD</STRONG></p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body></html>\n");
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