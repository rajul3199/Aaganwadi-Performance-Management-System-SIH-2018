package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Dish_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>Dish Activity</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    <link href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.1.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("html,body,h1,h2,h3,h4,h5 {font-family: \"Raleway\", sans-serif}\n");
      out.write("</style>\n");
      out.write("    \n");
      out.write("    <style>\n");
      out.write("        #m{\n");
      out.write("            box-shadow: 5px blue;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("<body class=\"w3-light-grey\">\n");
      out.write("\n");
      out.write("<!-- Top container -->\n");
      out.write("<div class=\"w3-bar w3-top w3-black w3-large\" style=\"z-index:4\">\n");
      out.write("  <button class=\"w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey\" onclick=\"w3_open();\"><i class=\"fa fa-bars\"></i>  Menu</button>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<!-- Sidebar/menu -->\n");
      out.write("<nav class=\"w3-sidebar w3-collapse w3-white w3-animate-left\" style=\"z-index:3;width:226px;\" id=\"mySidebar\"><br>\n");
      out.write("  <div class=\"w3-container w3-row\">\n");
      out.write("    <div class=\"w3-col s4\">\n");
      out.write("      <img class=\"w3-circle w3-margin-right\" style=\"width:46px\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3-col s8 w3-bar\">\n");
      out.write("      <span>Welcome, <strong></strong></span><br>\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-envelope\"></i></a>\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-user\"></i></a>\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-cog\"></i></a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <hr>\n");
      out.write("  <div class=\"w3-container\">\n");
      out.write("    <h5>Dashboard</h5>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"w3-bar-block\">\n");
      out.write("    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black\" onclick=\"w3_close()\" title=\"close menu\"><i class=\"fa fa-remove fa-fw\"></i>  Close Menu</a>\n");
      out.write("    <a href=\"#\" class=\"w3-bar-item w3-button w3-padding w3-blue\"><i class=\"fa fa-users fa-fw\"></i>  Overview</a>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("      <a href=\"AdminHome.jsp\" class=\"w3-bar-item w3-button w3-padding\"><i class=\"fa fa-cog fa-fw\"></i> Log Out</a><br><br>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Overlay effect when opening sidebar on small screens -->\n");
      out.write("<div class=\"w3-overlay w3-hide-large w3-animate-opacity\" onclick=\"w3_close()\" style=\"cursor:pointer\" title=\"close side menu\" id=\"myOverlay\"></div>\n");
      out.write("\n");
      out.write("<!-- !PAGE CONTENT! -->\n");
      out.write("<div class=\"w3-main\" style=\"margin-left:300px;margin-top:43px;\">\n");
      out.write("\n");
      out.write("  <!-- Header -->\n");
      out.write("  <header class=\"w3-container\" style=\"padding-top:22px\">\n");
      out.write("    <h5><b><i class=\"fa fa-dashboard\"></i> My Dashboard</b></h5>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <div class=\"w3-row-padding w3-margin-bottom\">\n");
      out.write("    <div class=\"w3-quarter\">\n");
      out.write("      <div class=\"w3-container w3-red w3-padding-16\">\n");
      out.write("        <div class=\"w3-left\"><i class=\"fa fa-gamepad w3-xxxlarge\"></i></div>\n");
      out.write("        <div class=\"w3-right\">\n");
      out.write("          <h3></h3>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w3-clear\"></div>\n");
      out.write("        <h4>Game</h4>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("        \n");
      out.write("        <div class=\"w3-quarter\">\n");
      out.write("      <div class=\"w3-container w3-blue w3-padding-16\">\n");
      out.write("        <div class=\"w3-left\"><i class=\"fa fa-book w3-xxxlarge\"></i></div>\n");
      out.write("        <div class=\"w3-right\">\n");
      out.write("          <h3></h3>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"w3-clear\"></div>\n");
      out.write("        <h4>Learn</h4>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("         <hr>\n");
      out.write("  <div class=\"w3-container\">\n");
      out.write("    <h5>General Stats</h5>\n");
      out.write("    <p>New Visitors</p>\n");
      out.write("    <div class=\"w3-grey\">\n");
      out.write("      <div class=\"w3-container w3-center w3-padding w3-green\" style=\"width:25%\">+25%</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <p>New Users</p>\n");
      out.write("    <div class=\"w3-grey\">\n");
      out.write("      <div class=\"w3-container w3-center w3-padding w3-orange\" style=\"width:50%\">50%</div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <p>Bounce Rate</p>\n");
      out.write("    <div class=\"w3-grey\">\n");
      out.write("      <div class=\"w3-container w3-center w3-padding w3-red\" style=\"width:75%\">75%</div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <hr>\n");
      out.write("   \n");
      out.write("    \n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                       \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>                     \n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("  <div class=\"w3-panel\">\n");
      out.write("    <div class=\"w3-row-padding\" style=\"margin:0 -16px\">\n");
      out.write("      <div class=\"w3-third\">\n");
      out.write("      \n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("      <div class=\"w3-twothird\">\n");
      out.write("       \n");
      out.write("      \n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("  \n");
      out.write("\n");
      out.write("  <div class=\"w3-container\">\n");
      out.write("    <h5></h5>\n");
      out.write("    <div class=\"w3-row\">\n");
      out.write("      <div class=\"w3-col m2 text-center\">\n");
      out.write("        <img class=\"w3-circle\"  style=\"width:96px;height:96px\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"w3-col m10 w3-container\">\n");
      out.write("        <h4> <span class=\"w3-opacity w3-medium\"></span></h4>\n");
      out.write("        <p></p><br>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"w3-row\">\n");
      out.write("      <div class=\"w3-col m2 text-center\">\n");
      out.write("        <img class=\"w3-circle\" \" style=\"width:96px;height:96px\">\n");
      out.write("      </div>\n");
      out.write("      <div class=\"w3-col m10 w3-container\">\n");
      out.write("        <h4> <span class=\"w3-opacity w3-medium\"></span></h4>\n");
      out.write("        <p></p><br>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <!-- Footer -->\n");
      out.write("<footer class=\"w3-center w3-black w3-padding-64\">\n");
      out.write("\n");
      out.write("    <p><STRONG>Powered by CODESQUAD</STRONG></p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Get the Sidebar\n");
      out.write("var mySidebar = document.getElementById(\"mySidebar\");\n");
      out.write("\n");
      out.write("// Get the DIV with overlay effect\n");
      out.write("var overlayBg = document.getElementById(\"myOverlay\");\n");
      out.write("\n");
      out.write("// Toggle between showing and hiding the sidebar, and add overlay effect\n");
      out.write("function w3_open() {\n");
      out.write("    if (mySidebar.style.display === 'block') {\n");
      out.write("        mySidebar.style.display = 'none';\n");
      out.write("        overlayBg.style.display = \"none\";\n");
      out.write("    } else {\n");
      out.write("        mySidebar.style.display = 'block';\n");
      out.write("        overlayBg.style.display = \"block\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("// Close the sidebar with the close button\n");
      out.write("function w3_close() {\n");
      out.write("    mySidebar.style.display = \"none\";\n");
      out.write("    overlayBg.style.display = \"none\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
