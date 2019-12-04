package dbutil;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.imageio.ImageIO;

public class DBConnect {

    Connection conn = null;

    public DBConnect() throws Exception {
          Class.forName("oracle.jdbc.driver.OracleDriver");
        conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr", "hr");
        
    }

    public void queryExecuter(String sql) throws Exception {
        Statement s = conn.createStatement();
        s.execute(sql);
        s.close();
    }

    public ResultSet queryReturner(String sql) throws Exception {
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery(sql);
        return rs;
    }
   public void delete(String sql) throws Exception
   {
       Statement s = conn.createStatement();
       s.execute(sql);
       s.close();
   }
    public void InsetImage(String sql,String aadhar) throws Exception {
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, aadhar);

        File f = new File("C:\\Program Files (x86)\\3M Cogent\\3MCogent-CSD200\\DotNet\\prakhar.bmp");
        FileReader fr = new FileReader(f);

        FileInputStream fin = new FileInputStream("prakhar.bmp");
        ps.setBinaryStream(2, fin, fin.available());
        int i = ps.executeUpdate();
        System.out.println(i + " records affected");

        conn.close();
    }

    public void RetriveImage() throws Exception {
        
        
        
        
        PreparedStatement ps = conn.prepareStatement("select * from image");
        System.out.println(ps);
        ResultSet rs = ps.executeQuery();
        while(rs.next()) {
           
            Blob b = rs.getBlob(2);//2 means 2nd column data  
            byte barr[] = b.getBytes(1, (int) b.length());//1 means first image  

          
           FileOutputStream fout = new FileOutputStream("d:\\prakhar.bmp");
            fout.write(barr);
           conn.close();
        }
    }

        public void image() throws Exception {

           
            
            
            
       BufferedImage imgA = null;
        BufferedImage imgB = null;

        try {
            
            
            
           File fileA = new File("prakhar.bmp");
            File fileB = new File("d:\\prakhar.bmp");

            imgA = ImageIO.read(fileA);
         
            imgB = ImageIO.read(fileB);
        } 
        catch (IOException e) {
            System.out.println(e);
        }
        int width1 = imgA.getWidth();
        int width2 = imgB.getWidth();
        int height1 = imgA.getHeight();
        int height2 = imgB.getHeight();

        if ((width1 != width2) || (height1 != height2)) {
            System.out.println("Error: Images dimensions"
                    + " mismatch");
        } else {
            long difference = 0;
            for (int y = 0; y < height1; y++) {
                for (int x = 0; x < width1; x++) {
                    int rgbA = imgA.getRGB(x, y);
                    int rgbB = imgB.getRGB(x, y);
                    int redA = (rgbA >> 16) & 0xff;
                    int greenA = (rgbA >> 8) & 0xff;
                    int blueA = (rgbA) & 0xff;
                    int redB = (rgbB >> 16) & 0xff;
                    int greenB = (rgbB >> 8) & 0xff;
                    int blueB = (rgbB) & 0xff;
                    difference += Math.abs(redA - redB);
                    difference += Math.abs(greenA - greenB);
                    difference += Math.abs(blueA - blueB);
                }
            }

            // Total number of red pixels = width * height
            // Total number of blue pixels = width * height
            // Total number of green pixels = width * height
            // So total number of pixels = width * height * 3
            double total_pixels = width1 * height1 * 3;

            // Normalizing the value of different pixels
            // for accuracy(average pixels per color
            // component)
            double avg_different_pixels = difference
                    / total_pixels;

            // There are 255 values of pixels in total
            double percentage = (avg_different_pixels
                    / 255) * 100;

            if (percentage <= 20) {
                System.out.println("Finger Print Matched");
            } else {
                System.out.println("FingerPrint Not Matched");
            }
        } 
    }
        
      
  /*   public static void main(String []args)
      {
          try{
              
              
          DBConnect x = new DBConnect();
          x.InsetImage("insert into image values(?,?)", "44548");
          x.RetriveImage();
          
          
          x.image();
          
          
          }
          catch(Exception ex)
          {
              
          }
      }*/
    }
