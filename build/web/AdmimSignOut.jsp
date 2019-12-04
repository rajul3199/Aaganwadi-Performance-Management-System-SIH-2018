<%-- 
    Document   : AdmimSignOut
    Created on : Mar 20, 2018, 12:31:27 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Sign-out</title>
    </head>
    <body>
      <%
            try
        {
            if(session.getAttribute("name")==null)
            {
                response.sendRedirect("adminlogin.jsp");
            }
        }
            catch(Exception ex)
            {
              out.println(ex);  
            }
        
        %>
        <% 
            session.removeAttribute("name");
            session.removeAttribute("aadhar");
            
            session.removeAttribute("pass");
            session.removeAttribute("mobile");
            session.removeAttribute("address");
            
            response.sendRedirect("adminlogin.jsp");
            
            
            %>
    </body>
</html>
