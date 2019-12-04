

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Monthly Checkup</title>
         <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
    </head>
    <body background="m12.jpg">
        <jsp:include page="workerheader.jspf"/>
        <%=session.getAttribute("name")%>
        <hr>
        <h2 align="center">Monthly Health Check up </h2>
        
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
       
<form method="get" action="check.jsp" id="loginform" class="form-horizontal" role="form">
        <div class="container">    
            <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
                <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Monthly Checkup</div>
                        <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#"></a></div>
                    </div>     

                    <div id="m">
                        <div style="padding-top:30px" class="panel-body" >

                            <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>

                                
                            <%--            <div style="margin-bottom: 25px" class="input-group">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <select id="login-username" class="form-control" name="t1">
                                        <option>--please Select--</option>
                                        <option>PregnentWomen</option>
                                        <option>AdolescentGirls</option>
                                    </select>                                        
                                </div>
--%>
                               <div style="margin-bottom: 25px" >
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <select id="login-username"  class="form-control" name="t1" value="" required>
                                        <option>--Please Select</option>
                                        <option>Adolescent Girls</option>
                                        <option>Pragnant Women</option>
                                    </select>                                        
                                </div>
                                       
                                <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="login-username" type="number" class="form-control" name="t2" value="" placeholder="Aadhar no."  required>                                        
                                </div>

                                
                                <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="login-username" type="number" class="form-control" name="t3" value="" placeholder="Weight in kg(s)" >                                        
                                </div>
  

                                    <h5>Health Issues</h5>
                                    <div>
                                        <textarea rows="4" cols="50" placeholder="Health issue if any" name="t4"></textarea>
                                    </div>
                                </div>
                        
                                 <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="login-username" type="text" class="form-control" name="t5" value="" placeholder="medicine" >                                        
                                </div>
                        
                                 <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                    <input id="login-username" type="text" class="form-control" name="t6" value="" placeholder="Nutrients" >                                        
                                </div>

                                <center>

                                    <div class="form-group">
                                        <button type="submit" class="btn btn-success" name="m1" value="women">Submit</button>

                                    </div>
                                    

                                </center>
                                </div>
                        </div>
                         



                    </div>                     
                </div>  
            </div>

        </form>
    </div>
</div>

<footer class="w3-center w3-black w3-padding-64">

    <p><STRONG>Powered by CODESQUAD</STRONG></p>
</footer>





</body></html>
