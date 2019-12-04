
import dbutil.DBConnect;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class workerreg {
    
    String name;
    String aadhar;
    String dob;
    String username;
    String pass;
    String mobile;
    String state;
    String city;
    String wardno;
    String awcno;
    String photo;

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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
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

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getWardno() {
        return wardno;
    }

    public void setWardno(String wardno) {
        this.wardno = wardno;
    }

    public String getAwcno() {
        return awcno;
    }

    public void setAwcno(String awcno) {
        this.awcno = awcno;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
   
    public boolean InsertReg(String name,String aadhar,String dob,String username,String pass
    ,String mobile, String state, String city, String wardno, String awcno )throws Exception
    {
        DBConnect x=new DBConnect();
        
               
        String sql="insert into workerreg values('"
                +name+"','"+aadhar+"',to_date('"+
                dob+"','yyyy-mm-dd'),'"
                + username+"','"+pass+"','"+mobile+"','"+state+"','"+city+"','"+
                wardno+"','"+awcno+"')";
        System.out.println(sql);
        x.queryExecuter(sql);
        return true;
    }
    
   public boolean workerlogincheck(String username,String pass) throws Exception
   {
        String sql="select * from workerreg where Username='"+username+"' and pass='"+
                pass+"'";
        System.out.println(sql);
        DBConnect x=new DBConnect();
        
       
        ResultSet rs= x.queryReturner(sql);
        if(rs.next())
        {
            this.setName(rs.getString(1));
            this.setAadhar(rs.getString(2));
            this.setDob(rs.getString(3));
            this.setUsername(rs.getString(4));
            this.setMobile(rs.getString(6));
            this.setState(rs.getString(7));
            this.setCity(rs.getString(8));
            this.setWardno(rs.getString(9));
            this.setAwcno(rs.getString(10));
            
            
            return true;
        }
        return false;
 
   }
   
 
}
