package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class growthstatus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Overall Status</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            #m{\n");
      out.write("                box-shadow: 5px blue;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("        <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("        function computeBMI() {\n");
      out.write("            // user inputs\n");
      out.write("            var height = Number(document.getElementById(\"height\").value);\n");
      out.write("            var heightunits = document.getElementById(\"heightunits\").value;\n");
      out.write("            var weight = Number(document.getElementById(\"weight\").value);\n");
      out.write("            var weightunits = document.getElementById(\"weightunits\").value;\n");
      out.write("\n");
      out.write("\n");
      out.write("            //Convert all units to metric\n");
      out.write("            if (heightunits == \"inches\") height /= 39.3700787;\n");
      out.write("            if (weightunits == \"lb\") weight /= 2.20462;\n");
      out.write("\n");
      out.write("            //Perform calculation\n");
      out.write("\n");
      out.write("            //        var BMI = weight /Math.pow(height, 2)*10000;\n");
      out.write("            var BMI = Math.round(weight / Math.pow(height, 2) * 10000);\n");
      out.write("\n");
      out.write("            //Display result of calculation\n");
      out.write("            document.getElementById(\"output\").innerText = Math.round(BMI * 100) / 100;\n");
      out.write("\n");
      out.write("            var output = Math.round(BMI * 100) / 100\n");
      out.write("            if (output < 18.5)\n");
      out.write("                document.getElementById(\"comment\").innerText = \"Underweight\";\n");
      out.write("            else if (output >= 18.5 && output <= 25)\n");
      out.write("                document.getElementById(\"comment\").innerText = \"Normal\";\n");
      out.write("            else if (output >= 25 && output <= 30)\n");
      out.write("                document.getElementById(\"comment\").innerText = \"Obese\";\n");
      out.write("            else if (output > 30)\n");
      out.write("                document.getElementById(\"comment\").innerText = \"Overweight\";\n");
      out.write("            // document.getElementById(\"answer\").value = output; \n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body background=\"m12.jpg\">\n");
      out.write("\n");
      out.write("        ");

            try {
                if (session.getAttribute("name") == null) {
                    response.sendRedirect("workerlogin.jsp");
                }
            } catch (Exception ex) {
                out.println(ex);
            }

        
      out.write(" \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "workerheader.jspf", out, false);
      out.write("\n");
      out.write("        <h2>Welcome Worker</h2>\n");
      out.write("        ");
      out.print(session.getAttribute("name"));
      out.write("\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        <h2 align=\"center\">Child Growth Status</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!------ Include the above in your HEAD tag ---------->\n");
      out.write("        <form method=\"get\" action=\"check.jsp\" id=\"loginform\" class=\"form-horizontal\" role=\"form\">\n");
      out.write("            <div class=\"container\">    \n");
      out.write("                <div id=\"loginbox\" style=\"margin-top:50px;\" class=\"mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2\">                    \n");
      out.write("                    <div class=\"panel panel-info\" >\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <div class=\"panel-title\"> Fill the details below to check the status </div>\n");
      out.write("                            <div style=\"float:right; font-size: 80%; position: relative; top:-10px\"><a href=\"#\"></a></div>\n");
      out.write("                        </div>     \n");
      out.write("\n");
      out.write("                        <div id=\"m\">\n");
      out.write("                            <div style=\"padding-top:30px\" class=\"panel-body\" >\n");
      out.write("\n");
      out.write("                                <div style=\"display:none\" id=\"login-alert\" class=\"alert alert-danger col-sm-12\"></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div style=\"margin-bottom: 25px\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-credit-card\"></i></span>\n");
      out.write("                                    <input id=\"login-username\" type=\"number\" class=\"form-control\" name=\"t1\" placeholder=\"Unique Id / Child's parent Id\" >                                        \n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div style=\"margin-bottom: 25px\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-calendar\"></i></span>\n");
      out.write("                                    <input id=\"login-username\" type=\"number\" class=\"form-control\" name=\"t2\" placeholder=\"Age\" >        \n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div style=\"margin-bottom: 25px\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-calendar\"></i></span>\n");
      out.write("                                    <input type=\"text\" id=\"height\" class=\"form-control\" class=\"form-control\" name=\"t3\" placeholder=\"Height\"/>\n");
      out.write("                                    <select type=\"multiple\" id=\"heightunits\" >\n");
      out.write("                                        <option value=\"metres\" selected=\"selected\">metres</option>\n");
      out.write("                                        <option value=\"inches\">inches</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <div style=\"margin-bottom: 25px\"> \n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-calendar\"></i></span>\n");
      out.write("                                    <input type=\"text\" id=\"weight\"class=\"form-control\" class=\"form-control\" name=\"t3\" placeholder=\"Weight\"/>\n");
      out.write("                                    <select type=\"multiple\" id=\"weightunits\" >\n");
      out.write("                                        <option value=\"kg\" selected=\"selected\">kilograms</option>\n");
      out.write("                                        <option value=\"lb\">pounds</option>\n");
      out.write("                                    </select>\n");
      out.write("                                </div>\n");
      out.write("                                <input type=\"button\" value=\"Compute BMI\" onclick=\"computeBMI()\n");
      out.write("                                            ;\">\n");
      out.write("                                <h4>Your BMI is: <span id=\"output\">?</span></h4>\n");
      out.write("\n");
      out.write("                                <h2>This means you are: <span id=\"comment\"> ?</span> </h2>  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div style=\"margin-bottom: 25px\">\n");
      out.write("                                    <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-tint\"></i></span>\n");
      out.write("                                    <input id=\"login-username\" type=\"number\" class=\"form-control\" name=\"t5\" placeholder=\"Haemoglobin(grams per deciliter)\" >                                        \n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div style=\"margin-bottom: 25px\">\n");
      out.write("                                    <span class=\"input-group-addon\"> <i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                                    Vaccines <input  type=\"checkbox\"  name=\"t5\"  value=\"Vaccine\">\n");
      out.write("                                    Medicines <input  type=\"checkbox\"  name=\"t6\"  value=\"Medicines\">                                \n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div style=\"margin-bottom: 25px\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <center>\n");
      out.write("\n");
      out.write("                                    <!-- Button -->\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <button type=\"submit\" name=\"l1\">Submit</button>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </center>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>                     \n");
      out.write("                </div>  \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        <footer class=\"w3-center w3-black w3-padding-64\">\n");
      out.write("\n");
      out.write("            <p><STRONG>Powered by CODESQUAD</STRONG></p>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body></html>\n");
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
