
<%@page import="java.io.File"%>
<%@page import="java.util.*"%>
<%@page import="dbutil.Benifisries"%>
<%@page import="dbutil.DBConnect"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>check Page</title>
    </head>
    <body>
        <%
            try
           {
            
               
               if(request.getParameter("s1")!=null)
              
               {
                    
                 
                  String aadhar= request.getParameter("t1");
                 
                
                  
                Benifisries b = new Benifisries();
                
                 if(b.childattendance(aadhar))
                 {
                     
                    
                     DBConnect x = new DBConnect();
                    
                   File  f= new File("C:\\Program Files (x86)\\3M Cogent\\3MCogent-CSD200\\DotNet\\prakhar.bmp");
                    String m = f.toString();
                     if(m==b.getPhoto())
                     {
                     
                     }
                     
                     String sql = "insert into attendance (name,aadhar,food,midmeal) values('"+
                        b.getName()+"','"+aadhar+"','"+request.getParameter("t2")+"','"+request.getParameter("t3")+"')";
              
                     System.out.println(sql);
                    x.queryExecuter(sql);
                    out.println("<h2 align='center'>Record Saved Sucessfully</h2>"); 
         
                    
                    
                 }
                
                 
                 
                } 
               
               if(request.getParameter("m1")!=null)
               {
                  
                   
                       String aadhar= request.getParameter("t2");
                        Benifisries b = new Benifisries();
                         
                          
                          
                          
                         if(b.Amonthlycheckup(aadhar)&&b.monthlycheckup(aadhar))
                         {
                         
                             DBConnect x = new DBConnect();
                            String sql = "insert into mcheckup (name,aadahr,btype,weight,hissue,medicine,nutrients) values('"+
                                    b.getName()+"','"+aadhar+"','"+request.getParameter("t1")+"','"+
                                    request.getParameter("t3")+"','"+request.getParameter("t4")+"','"+
                                    request.getParameter("t5")+"','"+request.getParameter("t6")+"')";
                            System.out.println(sql);  
                            
                            x.queryExecuter(sql);
                            
                           
                            
                            
                            
                            out.println("<h2 align='center'>Record Saved Sucessfully</h2>"); 
                    
                   
                    RequestDispatcher rd=request.getRequestDispatcher("MonthlyCheckup.jsp");
                    rd.include(request, response);
                         
                         }
                        
                        
                   }
                  
               if(request.getParameter("l1")!=null)
              
               {
                    
                 
                  String aadhar= request.getParameter("t1");
                 
                
                  
                 Benifisries b = new Benifisries();
                 
                
                 if(b.childgrowth(aadhar))
                 {
                     
                    
                     DBConnect x = new DBConnect();
                    
                     
                   
                     
                     String sql = "insert into growthstatus (aadhar,name,age,weight,height,hemoglobin) values('"+
                   
                             aadhar+"','"+b.getName()+"','"+request.getParameter("t2")+"','"+request.getParameter("t3")+"','"+request.getParameter("t4")+"','"+request.getParameter("t5")+"')";
              
                     System.out.println(sql);
                    x.queryExecuter(sql);
                    
                    out.println("<h2 align='center'>Record Saved Sucessfully</h2>"); 
                    
                    RequestDispatcher rd=request.getRequestDispatcher("growthstatus.jsp");
                    rd.include(request, response);
                    
                 }
                
                 
                 
                } 
                   if(request.getParameter("b4")!=null)
               {
                  
                   
                       String awcno= request.getParameter("t1");
                        Benifisries b = new Benifisries();
                         
                          
                          
                          
                         if(b.FoodDistributor(awcno))
                         {
                         
                             DBConnect x = new DBConnect();
                            String sql = "insert into fdistribution (name,awcno,f1,f2,f3,f4) values('"+
                                    b.getName()+"','"+awcno+"','"+
                                    request.getParameter("t3")+"','"+request.getParameter("t4")+"','"+
                                    request.getParameter("t5")+"','"+request.getParameter("t6")+"')";
                            System.out.println(sql);  
                            
                            x.queryExecuter(sql);
                            
                            
                            
                            
                            
                            out.println("<h2 align='center'>Record Saved Sucessfully</h2>"); 
                    
                   
                    RequestDispatcher rd=request.getRequestDispatcher("AWCR.jsp");
                    rd.include(request, response);
                         
                         }
                        
                        
                   }
               
                   else 
                   {
                       out.println("Incorrect data");
                        
                   }
                   
               }
            
            
            
            

                   
           catch(Exception ex)
           {
               out.println(ex);
           }
            
            
            
            
            %>
    </body>
</html>
