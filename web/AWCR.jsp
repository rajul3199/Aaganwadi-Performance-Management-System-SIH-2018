<!DOCTYPE html>
<html>
         <jsp:include page="AdminHeader.jspf"/>

    <title>Worker Registration</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <style>
        html,body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}
    </style>

    <style>
        #m{
            box-shadow: 5px blue;
        }
    </style>
    <body class="w3-light-grey">

        <!-- Top container -->
<div class="w3-bar w3-black w3-large" style="z-index:4">
    
  <button class="w3-bar-item w3-button  w3-hover-none w3-hover-text-light-grey" onclick="w3_open();"><i class="fa fa-bars"></i>  Menu</button>
  
</div>

        <!-- Sidebar/menu -->
        <nav class="w3-sidebar w3-collapse w3-white w3-animate-left" style="z-index:3;width:226px;" id="mySidebar"><br>
            <div class="w3-container w3-row">
                <div class="w3-col s4">
                    <img class="w3-circle w3-margin-right" style="width:46px">
                </div>
                <div class="w3-col s8 w3-bar">
                    <span>Welcome</span><br>

                </div>
            </div>
            <hr>
            <div class="w3-container">
                <h5>Dashboard</h5>
            </div>
            <div class="w3-bar-block">
                <a href="#" class="w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black" onclick="w3_close()" title="close menu"><i class="fa fa-remove fa-fw"></i>  Close Menu</a>
                <a href="#" class="w3-bar-item w3-button w3-padding w3-blue"><i class="fa fa-users fa-fw"></i>  Overview</a>
               <a href="AdminHome.jsp" class="w3-bar-item w3-button w3-padding"><i class="fa fa-cog fa-fw"></i> Log Out</a><br><br>
            </div>
        </nav>


        <!-- Overlay effect when opening sidebar on small screens -->
        <div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

        <!-- !PAGE CONTENT! -->
        <div class="w3-main" style="margin-left:300px;margin-top:43px;">

            <!-- Header -->
            <header class="w3-container" style="padding-top:22px">
                <h5><b><i class="fa fa-dashboard"></i> My Dashboard</b></h5>
            </header>



            <div class="w3-quarter">
                <!------ Include the above in your HEAD tag ---------->
                <form method="get" action="submit.jsp" id="loginform" class="form-horizontal" role="form">
                    <div class="container">    
                        <div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
                            <div class="panel panel-info" >
                                <div class="panel-heading">
                                    <div class="panel-title">Food Registration</div>
                                    <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#"></a></div>
                                </div>     

                                <div id="m">
                                    <div style="padding-top:30px" class="panel-body" >

                                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>



                                        <div style="margin-bottom: 5px">
                                            <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                            <input id="login-username" type="text" class="form-control" name="t1" value="" placeholder="Food Distributer" required="">                                         
                                        </div>

                                        <div style="margin-bottom: 5px">
                                            <span class="input-group-addon"><i class="glyphicon glyphicon-th"></i></span>
                                            <input id="login-username" type="number" class="form-control" name="t2" value="" placeholder="AWC ID" >

                                        </div>

                                        <form action="/action_page.php">
                                            <label ><h3>Food Details</h3></label>

                                            <div style="margin-bottom: 5px">

                                                <input id="login-username" type="text" class="form-control" name="t3" value="" placeholder="Item-1" >

                                            </div>

                                            <div style="margin-bottom: 5px">

                                                <input id="login-username" type="text" class="form-control" name="t4" value="" placeholder="Item-2" >

                                            </div>
                                            <div style="margin-bottom: 5px">

                                                <input id="login-username" type="text" class="form-control" name="t5" value="" placeholder="Item-3" >

                                            </div>
                                            <div style="margin-bottom: 5px">

                                                <input id="login-username" type="text" class="form-control" name="t6" value="" placeholder="Item-4" >

                                            </div>


                                            <center>

                                                <!-- Button -->

                                                <div class="form-group">
                                                    <button type="submit" name="a1" value="submit">Submit</button>

                                                </div>

                                            </center>
                                    </div>
                                </div>




                            </div>                     
                        </div>  
                    </div>

            </div>

            <div class="w3-panel">
                <div class="w3-row-padding" style="margin:0 -16px">
                    <div class="w3-third">


                    </div>
                    <div class="w3-twothird">


                    </div>
                </div>
            </div>
            <hr>

        </div>

        <hr>

        <div class="w3-container">
            <h5></h5>
            <div class="w3-row">
                <div class="w3-col m2 text-center">
                    <img class="w3-circle"  style="width:96px;height:96px">
                </div>
                <div class="w3-col m10 w3-container">
                    <h4> <span class="w3-opacity w3-medium"></span></h4>
                    <p></p><br>
                </div>
            </div>

            <div class="w3-row">
                <div class="w3-col m2 text-center">
                    <img class="w3-circle" " style="width:96px;height:96px">
                </div>
                <div class="w3-col m10 w3-container">
                    <h4> <span class="w3-opacity w3-medium"></span></h4>
                    <p></p><br>
                </div>
            </div>
        </div>

        <script>
            // Get the Sidebar
            var mySidebar = document.getElementById("mySidebar");

            // Get the DIV with overlay effect
            var overlayBg = document.getElementById("myOverlay");

            // Toggle between showing and hiding the sidebar, and add overlay effect
            function w3_open() {
                if (mySidebar.style.display === 'block') {
                    mySidebar.style.display = 'none';
                    overlayBg.style.display = "none";
                } else {
                    mySidebar.style.display = 'block';
                    overlayBg.style.display = "block";
                }
            }

            // Close the sidebar with the close button
            function w3_close() {
                mySidebar.style.display = "none";
                overlayBg.style.display = "none";
            }
        </script>

    </body>
</html>