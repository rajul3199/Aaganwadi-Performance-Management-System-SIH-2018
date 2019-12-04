<%-- 
    Document   : WorkerR
    Created on : 17 Mar, 2018, 1:26:28 PM
    Author     : Rakesh Kumar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pregnant Registration</title>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
         <style>
        #m{
            box-shadow: 5px blue;
        }
    </style>
    </head>
  
       
  
    <body background="m12.jpg">

        <div c
        <jsp:include page="workerheader.jspf"/>
        <h2>Welcome Worker</h2>
        <%=session.getAttribute("name")%>
        <hr>
        <h2 align="center">Pregnant Women Registration</h2>
        
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

        <!------ Include the above in your HEAD tag ---------->
        <form method="get" action="submit.jsp" id="loginform" class="form-horizontal" role="form">
        <div class="container">    
            <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
                <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Pregnant Registration</div>
                        <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#"></a></div>
                    </div>     

                    <div id="m">
                        <div style="padding-top:30px"  >

                            <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>

                           

                                <div style="margin-bottom: 25px" >
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="login-username" type="text" class="form-control" name="t1" value="" placeholder="Full Name">                                        
                                </div>

                                <div style="margin-bottom: 25px" >
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-th"></i></span>
                                    <input id="login-password" type="number" class="form-control" name="t2" placeholder="AADHAR No.">
                                </div>
                                
                                
                                
                                <div style="margin-bottom: 25px" >
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="login-password" type="text" class="form-control" name="t3" placeholder="Husband's Name">
                                </div>
                                
                                <div style="margin-bottom: 25px" >
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                                    <input id="login-username" type="number" class="form-control" name="t4" value="" placeholder="Contact Number" >                                        
                                </div>

                                
                                 <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="login-password" type="text" class="form-control" name="t5" placeholder="Address">
                                </div>
                               
                                 <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="login-password" type="number" class="form-control" name="t6" placeholder="Pregnancy Month">
                                </div>
                               
                                
                               <center>

                                    <!-- Button -->

                                    <div class="form-group">
                                        <button type="submit" name="b2" value="submit1">Submit</button>

                                    </div>

                                </center>
                        </div>
                    </div>
                    



                </div>                     
            </div>  
        </div>

    </form>
        <footer class="w3-center w3-black w3-padding-64">

    <p><STRONG>Powered by CODESQUAD</STRONG></p>
</footer>




</body>
</html>
      
        

