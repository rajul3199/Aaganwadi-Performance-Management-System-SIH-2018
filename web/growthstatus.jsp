<%-- 
    Document   : AWCR
    Created on : 26 Mar, 2018, 11:34:56 AM
    Author     : Rakesh Kumar
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Overall Status</title>



        <style>
            #m{
                box-shadow: 5px blue;
            }
        </style>

        <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script type="text/javascript">

        function computeBMI() {
            // user inputs
            var height = Number(document.getElementById("height").value);
            var heightunits = document.getElementById("heightunits").value;
            var weight = Number(document.getElementById("weight").value);
            var weightunits = document.getElementById("weightunits").value;


            //Convert all units to metric
            if (heightunits == "inches") height /= 39.3700787;
            if (weightunits == "lb") weight /= 2.20462;

            //Perform calculation

            //        var BMI = weight /Math.pow(height, 2)*10000;
            var BMI = Math.round(weight / Math.pow(height, 2) * 10000);

            //Display result of calculation
            document.getElementById("output").innerText = Math.round(BMI * 100) / 100;

            var output = Math.round(BMI * 100) / 100
            if (output < 18.5)
                document.getElementById("comment").innerText = "Underweight";
            else if (output >= 18.5 && output <= 25)
                document.getElementById("comment").innerText = "Normal";
            else if (output >= 25 && output <= 30)
                document.getElementById("comment").innerText = "Obese";
            else if (output > 30)
                document.getElementById("comment").innerText = "Overweight";
            // document.getElementById("answer").value = output; 
        }
    </script>
    </head>

    <body background="m12.jpg">

        <%
            try {
                if (session.getAttribute("name") == null) {
                    response.sendRedirect("workerlogin.jsp");
                }
            } catch (Exception ex) {
                out.println(ex);
            }

        %> 
        <jsp:include page="workerheader.jspf"/>
        <h2>Welcome Worker</h2>
        <%=session.getAttribute("name")%>

        <hr>
        <h2 align="center">Child Growth Status</h2>





        <!------ Include the above in your HEAD tag ---------->
        <form method="get" action="check.jsp" id="loginform" class="form-horizontal" role="form">
            <div class="container">    
                <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
                    <div class="panel panel-info" >
                        <div class="panel-heading">
                            <div class="panel-title"> Fill the details below to check the status </div>
                            <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#"></a></div>
                        </div>     

                        <div id="m">
                            <div style="padding-top:30px" class="panel-body" >

                                <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>


                                <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-credit-card"></i></span>
                                    <input id="login-username" type="number" class="form-control" name="t1" placeholder="Unique Id / Child's parent Id" >                                        
                                </div>

                                <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
                                    <input id="login-username" type="number" class="form-control" name="t2" placeholder="Age" >        

                                </div>

                                <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
                                    <input type="text" id="height" class="form-control" class="form-control" name="t3" placeholder="Height"/>
                                    <select type="multiple" id="heightunits" >
                                        <option value="metres" selected="selected">metres</option>
                                        <option value="inches">inches</option>
                                    </select>
                                </div>
                                <div style="margin-bottom: 25px"> 
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-calendar"></i></span>
                                    <input type="text" id="weight"class="form-control" class="form-control" name="t3" placeholder="Weight"/>
                                    <select type="multiple" id="weightunits" >
                                        <option value="kg" selected="selected">kilograms</option>
                                        <option value="lb">pounds</option>
                                    </select>
                                </div>
                                <input type="button" value="Compute BMI" onclick="computeBMI()
                                            ;">
                                <h4>Your BMI is: <span id="output">?</span></h4>

                                <h2>This means you are: <span id="comment"> ?</span> </h2>  





                                <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"><i class="glyphicon glyphicon-tint"></i></span>
                                    <input id="login-username" type="number" class="form-control" name="t5" placeholder="Haemoglobin(grams per deciliter)" >                                        
                                </div>

                                <div style="margin-bottom: 25px">
                                    <span class="input-group-addon"> <i class="glyphicon glyphicon-user"></i></span>
                                    Vaccines <input  type="checkbox"  name="t5"  value="Vaccine">
                                    Medicines <input  type="checkbox"  name="t6"  value="Medicines">                                
                                </div>







                                <div style="margin-bottom: 25px">
                                </div>


                                <center>

                                    <!-- Button -->

                                    <div class="form-group">
                                        <button type="submit" name="l1">Submit</button>

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


    </body></html>
