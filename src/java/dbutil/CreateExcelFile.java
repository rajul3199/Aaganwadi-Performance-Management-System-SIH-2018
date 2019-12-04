package dbutil;

import dbutil.DBConnect;
import java.io.*;
import java.sql.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;

public class CreateExcelFile {

    public void Start() {
        try {
            String filename = "C:\\Users\\hp\\Desktop\\projectb\\web\\excel\\attendance.xls";
            HSSFWorkbook hwb = new HSSFWorkbook();
            HSSFSheet sheet = hwb.createSheet("new sheet");

            HSSFRow rowhead = sheet.createRow((short) 0);
            rowhead.createCell((short) 0).setCellValue("Sr No.");
            rowhead.createCell((short) 1).setCellValue("Name");
            rowhead.createCell((short) 2).setCellValue("Aadhar");
            rowhead.createCell((short) 3).setCellValue("Food");
             rowhead.createCell((short) 4).setCellValue("MidDayMeal");
            rowhead.createCell((short) 5).setCellValue("Date & Time");

           DBConnect x = new DBConnect();
           
           String Sql = "select * from attendance";
            
           ResultSet rs = x.queryReturner(Sql);
            int i = 1;
            while (rs.next()) {
                HSSFRow row = sheet.createRow((short) i);
                row.createCell((short) 0).setCellValue(i);
                row.createCell((short) 1).setCellValue(rs.getString(1));
                row.createCell((short) 2).setCellValue(rs.getString(2));
                row.createCell((short) 3).setCellValue(rs.getString(3));
                row.createCell((short) 4).setCellValue(rs.getString(5));
                row.createCell((short) 5).setCellValue(rs.getString(4));
                i++;
            }
            FileOutputStream fileOut = new FileOutputStream(filename);
            hwb.write(fileOut);
            fileOut.close();
            System.out.println("Your excel file has been generated!");
            
            
   
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
    
     public void RegChild() {
        try {
            String filename = "C:\\Users\\hp\\Desktop\\projectb\\web\\excel\\regchild.xls";
            HSSFWorkbook hwb = new HSSFWorkbook();
            HSSFSheet sheet = hwb.createSheet("new sheet");

            HSSFRow rowhead = sheet.createRow((short) 0);
            rowhead.createCell((short) 0).setCellValue("Sr No.");
            rowhead.createCell((short) 1).setCellValue("Name");
            rowhead.createCell((short) 2).setCellValue("Aadhar");
            rowhead.createCell((short) 3).setCellValue("Mother's Name");
            rowhead.createCell((short) 5).setCellValue("Father's Name");
            rowhead.createCell((short) 6).setCellValue("DOB Certificate NO.");
            rowhead.createCell((short) 7).setCellValue("Gender");
            rowhead.createCell((short) 8).setCellValue("Address"); 
            rowhead.createCell((short) 9).setCellValue("Mobile");
            
            rowhead.createCell((short) 10).setCellValue("Date");
            

           DBConnect x = new DBConnect();
           
           String Sql = "select * from regchild";
            
           ResultSet rs = x.queryReturner(Sql);
            int i = 1;
            while (rs.next()) {
                HSSFRow row = sheet.createRow((short) i);
                row.createCell((short) 0).setCellValue(i);
                row.createCell((short) 1).setCellValue(rs.getString(1));
                row.createCell((short) 2).setCellValue(rs.getString(2));
                row.createCell((short) 3).setCellValue(rs.getString(3));
                row.createCell((short) 4).setCellValue(rs.getString(4));
                row.createCell((short) 5).setCellValue(rs.getString(5));
                row.createCell((short) 6).setCellValue(rs.getString(6));
                row.createCell((short) 7).setCellValue(rs.getString(7));
                row.createCell((short) 8).setCellValue(rs.getString(8));
                row.createCell((short) 9).setCellValue(rs.getString(9));
                i++;
            }
            FileOutputStream fileOut = new FileOutputStream(filename);
            hwb.write(fileOut);
            fileOut.close();
            System.out.println("Your excel file has been generated!");
            
            
   
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
     
     public void AdolescentGirl() {
        try {
            String filename = "C:\\Users\\hp\\Desktop\\projectb\\web\\excel\\adolescent.xls";
            HSSFWorkbook hwb = new HSSFWorkbook();
            HSSFSheet sheet = hwb.createSheet("new sheet");

            HSSFRow rowhead = sheet.createRow((short) 0);
            rowhead.createCell((short) 0).setCellValue("Sr No.");
            rowhead.createCell((short) 1).setCellValue("Name");
            rowhead.createCell((short) 2).setCellValue("Aadhar");
            rowhead.createCell((short) 3).setCellValue("Mother's Name");
            rowhead.createCell((short) 4).setCellValue("Father's Name");
            rowhead.createCell((short) 5).setCellValue("Age");
            rowhead.createCell((short) 6).setCellValue("Mobile");
            rowhead.createCell((short) 7).setCellValue("Address"); 
            rowhead.createCell((short) 8).setCellValue("Date");
            

           DBConnect x = new DBConnect();
           
           String Sql = "select * from regadolescent";
            
           ResultSet rs = x.queryReturner(Sql);
            int i = 1;
            while (rs.next()) {
                HSSFRow row = sheet.createRow((short) i);
                row.createCell((short) 0).setCellValue(i);
                row.createCell((short) 1).setCellValue(rs.getString(1));
                row.createCell((short) 2).setCellValue(rs.getString(2));
                row.createCell((short) 3).setCellValue(rs.getString(3));
                row.createCell((short) 4).setCellValue(rs.getString(4));
                row.createCell((short) 5).setCellValue(rs.getString(5));
                row.createCell((short) 6).setCellValue(rs.getString(6));
                row.createCell((short) 7).setCellValue(rs.getString(7));
                row.createCell((short) 8).setCellValue(rs.getString(8));
                i++;
            }
            FileOutputStream fileOut = new FileOutputStream(filename);
            hwb.write(fileOut);
            fileOut.close();
            System.out.println("Your excel file has been generated!");
            
            
   
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
     
     public void RegWomen() {
        try {
            String filename = "C:\\Users\\hp\\Desktop\\projectb\\web\\excel\\pwomen.xls";
            HSSFWorkbook hwb = new HSSFWorkbook();
            HSSFSheet sheet = hwb.createSheet("new sheet");

            HSSFRow rowhead = sheet.createRow((short) 0);
            rowhead.createCell((short) 0).setCellValue("Sr No.");
            rowhead.createCell((short) 1).setCellValue("Name");
            rowhead.createCell((short) 2).setCellValue("Aadhar");
            rowhead.createCell((short) 3).setCellValue("Husband's Name");
            rowhead.createCell((short) 4).setCellValue("Mobile");
            rowhead.createCell((short) 5).setCellValue("Address");
            rowhead.createCell((short) 6).setCellValue("Pregnant Month");
            rowhead.createCell((short) 7).setCellValue("Date");
            

           DBConnect x = new DBConnect();
           
           String Sql = "select * from regwomen";
            
           ResultSet rs = x.queryReturner(Sql);
            int i = 1;
            while (rs.next()) {
                HSSFRow row = sheet.createRow((short) i);
                row.createCell((short) 0).setCellValue(i);
                row.createCell((short) 1).setCellValue(rs.getString(1));
                row.createCell((short) 2).setCellValue(rs.getString(2));
                row.createCell((short) 3).setCellValue(rs.getString(3));
                row.createCell((short) 4).setCellValue(rs.getString(4));
              row.createCell((short) 5).setCellValue(rs.getString(5));
               row.createCell((short) 6).setCellValue(rs.getString(6));
                row.createCell((short) 7).setCellValue(rs.getString(7));
                i++;
            }
            FileOutputStream fileOut = new FileOutputStream(filename);
            hwb.write(fileOut);
            fileOut.close();
            System.out.println("Your excel file has been generated!");
            
            
   
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
     
     public void WorkerReg() {
        try {
            String filename = "C:\\Users\\hp\\Desktop\\projectb\\web\\excel\\workerreg.xls";
            HSSFWorkbook hwb = new HSSFWorkbook();
            HSSFSheet sheet = hwb.createSheet("new sheet");

            HSSFRow rowhead = sheet.createRow((short) 0);
          rowhead.createCell((short) 0).setCellValue("Sr No.");
            rowhead.createCell((short) 1).setCellValue("Name");
            rowhead.createCell((short) 2).setCellValue("Aadhar");
            rowhead.createCell((short) 3).setCellValue("Date oF Birth");
            
            rowhead.createCell((short) 4).setCellValue("User Name");
           rowhead.createCell((short) 5).setCellValue("PassWord");
            rowhead.createCell((short) 6).setCellValue("Mobile");
            rowhead.createCell((short) 7).setCellValue("State");
            rowhead.createCell((short) 8).setCellValue("City");
            
            rowhead.createCell((short) 9).setCellValue("Ward Number");
            rowhead.createCell((short) 10).setCellValue("AWC Number");
            

           DBConnect x = new DBConnect();
           
           String Sql = "select * from workerreg";
            
           ResultSet rs = x.queryReturner(Sql);
            int i = 1;
            while (rs.next()) {
                HSSFRow row = sheet.createRow((short) i);
               row.createCell((short) 0).setCellValue(i);
                row.createCell((short) 1).setCellValue(rs.getString(1));
                row.createCell((short) 2).setCellValue(rs.getString(2));
                row.createCell((short) 3).setCellValue(rs.getString(3));
               row.createCell((short) 4).setCellValue(rs.getString(5));
              row.createCell((short) 5).setCellValue(rs.getString(6));
                row.createCell((short) 6).setCellValue(rs.getString(7));
                row.createCell((short) 7).setCellValue(rs.getString(8));
                row.createCell((short) 8).setCellValue(rs.getString(9));
                row.createCell((short) 9).setCellValue(rs.getString(10));
                row.createCell((short) 10).setCellValue(rs.getString(11));
                i++;
            }
            FileOutputStream fileOut = new FileOutputStream(filename);
            hwb.write(fileOut);
            fileOut.close();
            System.out.println("Your excel file has been generated!");
            
            
   
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
     
       public void Mcheckup() {
        try {
            String filename = "C:\\Users\\hp\\Desktop\\projectb\\web\\excel\\mcheckup.xls";
            HSSFWorkbook hwb = new HSSFWorkbook();
            HSSFSheet sheet = hwb.createSheet("new sheet");

            HSSFRow rowhead = sheet.createRow((short) 0);
            rowhead.createCell((short) 0).setCellValue("Sr No.");
            rowhead.createCell((short) 1).setCellValue("Name");
            rowhead.createCell((short) 2).setCellValue("Aadhar");
            rowhead.createCell((short) 3).setCellValue("User Type");
            
            rowhead.createCell((short) 4).setCellValue("Weight");
            rowhead.createCell((short) 5).setCellValue("Health Issue");
            rowhead.createCell((short) 6).setCellValue("Medicine");
            rowhead.createCell((short) 7).setCellValue("Nutrients");
            rowhead.createCell((short) 8).setCellValue("Date");  

           DBConnect x = new DBConnect();
           
           String Sql = "select * from mcheckup";
            
           ResultSet rs = x.queryReturner(Sql);
            int i = 1;
            while (rs.next()) {
                HSSFRow row = sheet.createRow((short) i);
                row.createCell((short) 0).setCellValue(i);
                row.createCell((short) 1).setCellValue(rs.getString(1));
                row.createCell((short) 2).setCellValue(rs.getString(2));
                row.createCell((short) 3).setCellValue(rs.getString(3));
                row.createCell((short) 4).setCellValue(rs.getString(4));
                row.createCell((short) 5).setCellValue(rs.getString(5));
                row.createCell((short) 6).setCellValue(rs.getString(6));
                row.createCell((short) 7).setCellValue(rs.getString(7));
                row.createCell((short) 8).setCellValue(rs.getString(8));
               
                i++;
            }
            FileOutputStream fileOut = new FileOutputStream(filename);
            hwb.write(fileOut);
            fileOut.close();
            System.out.println("Your excel file has been generated!");
            
            
   
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
     
     public void Fdetails() {
        try {
            String filename = "C:\\Users\\hp\\Desktop\\projectb\\web\\excel\\fdetails.xls";
            HSSFWorkbook hwb = new HSSFWorkbook();
            HSSFSheet sheet = hwb.createSheet("new sheet");

            HSSFRow rowhead = sheet.createRow((short) 0);
            rowhead.createCell((short) 0).setCellValue("Sr No.");
            rowhead.createCell((short) 1).setCellValue("Name");
            rowhead.createCell((short) 2).setCellValue("AWC Center No.");
            rowhead.createCell((short) 3).setCellValue("Item 1");
            rowhead.createCell((short) 4).setCellValue("Item 2");
            rowhead.createCell((short) 5).setCellValue("Item 3");
            rowhead.createCell((short) 6).setCellValue("Item 4");
            rowhead.createCell((short) 7).setCellValue("Date & Time");

           DBConnect x = new DBConnect();
           
           String Sql = "select * from fdistribution";
            
           ResultSet rs = x.queryReturner(Sql);
            int i = 1;
            while (rs.next()) {
                HSSFRow row = sheet.createRow((short) i);
                row.createCell((short) 0).setCellValue(i);
                row.createCell((short) 1).setCellValue(rs.getString(1));
                row.createCell((short) 2).setCellValue(rs.getString(2));
                row.createCell((short) 3).setCellValue(rs.getString(3));
                row.createCell((short) 4).setCellValue(rs.getString(4));
                 row.createCell((short) 5).setCellValue(rs.getString(5));
                  row.createCell((short) 6).setCellValue(rs.getString(6));
                   row.createCell((short) 7).setCellValue(rs.getString(7));
                   
                i++;
            }
            FileOutputStream fileOut = new FileOutputStream(filename);
            hwb.write(fileOut);
            fileOut.close();
            System.out.println("Your excel file has been generated!");
            
            
   
        } catch (Exception ex) {
            System.out.println(ex);

        }
    } 
   /*  public static void main(String [] args)
     {
         CreateExcelFile x = new CreateExcelFile();
         x.Fdetails();
     }
     */
     
}
