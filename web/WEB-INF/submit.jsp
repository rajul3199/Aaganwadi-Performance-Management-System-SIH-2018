

<%@page import="dbutil.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
           try
           {
              DBConnect x = new DBConnect();
               
               String sql = "insert into workerreg values('"
                       +request.getParameter("t1")+"','"
                       +request.getParameter("t2")+"',to_date('"
                       +request.getParameter("t3")+"','dd/mm/yyyy'),'"
                       +request.getParameter("t4")+"','"
                       +request.getParameter("t5")+"','"
                       +request.getParameter("t6")+"','"
                       +request.getParameter("t7")+"','"
                       +request.getParameter("t8")+"','"
                       +request.getParameter("t9")+"','"
                       +request.getParameter("t10")+"','"
                       +request.getParameter("t11")+"')";
                       
                       

                       out.println("Record Saved SucessFully");
           }
           catch(Exception ex)
           {
               out.println(ex);
           }
       %>
    </body>
</html>
