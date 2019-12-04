package dbutil;


import dbutil.DBConnect;
import java.io.File;
import java.sql.ResultSet;

public class Benifisries {
    
    String name;
    String aadhar;
    String dobcertificate;
    String mname;
    String fname;
    String hname;
    String mobile;
    String age;
    String city;
    String gender;
    String pmonth;
    String address;
    String food;
    String awcno;
    String photo;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

   

    

    public String getAwcno() {
        return awcno;
    }

    public void setAwcno(String awcno) {
        this.awcno = awcno;
    }
        
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadhar() {
        return aadhar;
    }

    public void setAadhar(String aadhar) {
        this.aadhar = aadhar;
    }

    public String getDobcertificate() {
        return dobcertificate;
    }

    public void setDobcertificate(String dobcertificate) {
        this.dobcertificate = dobcertificate;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPmonth() {
        return pmonth;
    }

    public void setPmonth(String pmonth) {
        this.pmonth = pmonth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public boolean childattendance(String aadhar) throws Exception
    {
       String sql ="select * from regchild where aadhar='"+aadhar+"'";
        System.out.println(sql);
       DBConnect x = new DBConnect();
       ResultSet rs= x.queryReturner(sql);
       
      while(rs.next())
      {
         this.setName(rs.getString(1));
          this.setAadhar(rs.getString(2));
          this.setMname(rs.getString(3));
          this.setFname(rs.getString(4));
          this.setDobcertificate(rs.getString(5));
          this.setMobile(rs.getString(6));
          this.setAddress(rs.getString(7));
          this.setGender(rs.getString(8));
          this.setPhoto(rs.getString(9));
          
          return true;
      }
    
      return false;
    }
    
    
    public boolean monthlycheckup(String aadhar) throws Exception
    {
         String sql ="select * from regwomen where aadhar='"+aadhar+"'";
        System.out.println(sql);
       DBConnect x = new DBConnect();
       ResultSet rs= x.queryReturner(sql);
       
      while(rs.next())
      {
         this.setName(rs.getString(1));
          this.setAadhar(rs.getString(2));
          this.setHname(rs.getString(3));
          this.setMobile(rs.getString(4));
          this.setAddress(rs.getString(5));
          this.setPmonth(rs.getString(6));
          
          return true;
      }
        return false;
    }
    
   
 public boolean Amonthlycheckup(String aadhar) throws Exception
    {
         String sql ="select * from regadolescent where aadhar='"+aadhar+"'";
        System.out.println(sql);
       DBConnect x = new DBConnect();
       ResultSet rs= x.queryReturner(sql);
       
      while(rs.next())
      {
         this.setName(rs.getString(1));
         this.setAadhar(rs.getString(2));
         this.setMname(rs.getString(3));
         this.setFname(rs.getString(4));
         this.setAge(rs.getString(5));
         this.setMobile(rs.getString(6));
         this.setAddress(rs.getString(7));
         
          
          
          return true;
      }
        return false;
    }
 
 public boolean FoodDistributor(String awcno) throws Exception
    {
         String sql ="select * from workerreg where awcno='"+awcno+"'";
        System.out.println(sql);
       DBConnect x = new DBConnect();
       ResultSet rs= x.queryReturner(sql);
       
      while(rs.next())
      {
         this.setName(rs.getString(1));
         this.setAadhar(rs.getString(2));
         this.setMobile(rs.getString(7));
         this.setAwcno(rs.getString(11));
         
          return true;
      }
        return false;
    }
 
    public boolean childgrowth(String aadhar) throws Exception
    {
         String sql ="select * from regchild where aadhar='"+aadhar+"'";
        System.out.println(sql);
       DBConnect x = new DBConnect();
       ResultSet rs= x.queryReturner(sql);
       
      while(rs.next())
      {
         this.setName(rs.getString(1));
         this.setAadhar(rs.getString(2));
         this.setMobile(rs.getString(8));
         
         
          return true;
      }
        return false;
    }
    
  public boolean check(String aadhar) throws Exception
  {
       String sql ="select * from regchild where aadhar='"+aadhar+"'";
        System.out.println(sql);
       DBConnect x = new DBConnect();
       ResultSet rs= x.queryReturner(sql);
       
      while(rs.next())
      {
         this.setName(rs.getString(1));
         this.setAadhar(rs.getString(2));
         this.setMobile(rs.getString(8));
         
         
          return true;
      }
        return false;
  }
}
