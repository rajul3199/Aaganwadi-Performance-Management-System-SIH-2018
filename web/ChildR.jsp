

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Child Registration</title>
       
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

        
        <jsp:include page="workerheader.jspf"/>
        <h2>Welcome Worker</h2>
        <%=session.getAttribute("name")%>
        <hr>
        <h2 align="center">Child Registration</h2>
        
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
        <form method="get" action="submit.jsp" id="loginform" class="form-horizontal" role="form">
       <div class="container">    
            <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
                <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Children Registration</div>
                        <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#"></a></div>
                    </div>     

                    <div id="m">
                        <div style="padding-top:30px" class="panel-body" >

                            <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>

                    

                                <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="login-username" type="text" class="form-control" name="t1" value="" placeholder="Child FullName">                                        
                                </div>

                                <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-th"></i></span>
                                    <input id="login-password" type="number" class="form-control" name="t2" placeholder=" Parent's AADHAR No.">
                                </div>
                                
                                <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <select id="login-username"  class="form-control" name="t7" value="" placeholder=Gender >   
                                        <option>Male</option>
                                        <option>Female</option>
                                    </select>
                                </div>
                                
                                <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="login-password" type="text" class="form-control" name="t3" placeholder="Mother's Name">
                                </div>
                                
                                
                                <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="login-password" type="text" class="form-control" name="t4" placeholder="Father's Name">
                                </div>
                                
                                <div style="margin-bottom: 25px">                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="login-password" type="text" class="form-control" name="t5" placeholder="Date Of Birth Certificate No.">
                                </div>
                                
                                <div style="margin-bottom: 25px" >
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-earphone"></i></span>
                                    <input id="login-password" type="number" class="form-control" name="t8" placeholder="Mobile">
                                </div>
                                
                                
                                

                                
                                 <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-road"></i></span>
                                    <input id="login-password" type="text" class="form-control" name="t6" placeholder="Address">
                                </div>
                               
                                <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="login-username" type="file" class="form-control" name="t9" value="" placeholder="Child FullName">                                        
                                </div>
                                
                               <center>

                                    <!-- Button -->

                                    <div class="form-group">
                                        <button type="submit" name="b3" value="submit2">Submit</button>

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
