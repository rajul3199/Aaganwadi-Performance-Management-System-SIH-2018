
<%@page import="dbutil.Benifisries"%>
<%@page import="dbutil.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Submit</title>
    </head>
    <body>
       <%
           try
           {
               DBConnect x = new DBConnect();
               
              
        if(request.getParameter("b1")!=null)
              {
               String sql = "insert into adolescentreg (name,aadhar,mothername,fathername,age,contact,address) values('"
                       +request.getParameter("t1")+"','"
                       +request.getParameter("t2")+"','"
                       +request.getParameter("t3")+"','"
                       +request.getParameter("t4")+"','"
                       +request.getParameter("t5")+"','"
                       +request.getParameter("t6")+"','"
                       +request.getParameter("t7")+"')";
                       
               System.out.println(sql);
                    x.queryExecuter(sql);
                    
                     out.println("Record Saved Sucessfully"); 
                    
                   
                     
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
                     out.println("Record Saved Sucessfully"); 
                    
                   
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
                       
                 
                 
                    out.println("Record Saved Sucessfully"); 
                    
                   
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
                    
                    out.println("Record Saved Sucessfully"); 
                    
                   
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
       %>
    </body>
</html>
