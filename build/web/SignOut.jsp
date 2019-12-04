

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign-out</title>
    </head>
    <body>
        <%
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
        
        %>
        <% 
            session.removeAttribute("name");
            session.removeAttribute("aadhar");
            session.removeAttribute("dob");
            session.removeAttribute("photo");
            session.removeAttribute("pass");
            session.removeAttribute("mobile");
            session.removeAttribute("state");
            session.removeAttribute("city");
            session.removeAttribute("wardno");
            session.removeAttribute("awcno");
            response.sendRedirect("workerlogin.jsp");
            
            
            %>
        
    </body>
</html>
