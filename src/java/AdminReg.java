
import dbutil.DBConnect;
import java.sql.ResultSet;

public class AdminReg {
    
    String name;
    String aadhar;
    String username;
    String pass;
    String mobile;
    String address;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String password) {
        this.pass = pass;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
            
    
      
  public boolean adminlogincheck(String username,String pass) throws Exception
  {
      String sql = "select * from admin where username='"+username+"' and pass='"+pass+"'";
      System.out.println(sql);
      DBConnect x = new DBConnect();
      
      ResultSet rs = x.queryReturner(sql);
      
      while(rs.next())
      {
          this.setName(rs.getString(1));
          this.setAadhar(rs.getString(5));
          this.setUsername(rs.getString(2));
          this.setMobile(rs.getString(4));
          this.setAddress(rs.getString(6));
          return true;
      }
      
      return false;
  }
   
}
