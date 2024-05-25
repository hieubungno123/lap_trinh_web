package qlsv;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SV {
	private String masv;
    private String hodem;
    private String tensv;
    private String telsv;
    private String emailsv;
    
    public void setMasv (String varMasv){
        this.masv=varMasv;
    }
    public void setHodem (String varHodem){
        this.hodem=varHodem;
    }
    public void setTensv (String varTensv){
        this.tensv=varTensv;
    }
    public void setTelsv(String varTelsv){
        this.telsv=varTelsv;
    }
    public void setEmailsv(String varEmailsv){
        this.emailsv=varEmailsv;
    }

    public String getMasv (){
        return this.masv;
    }
    public String getHodem (){
        return this.hodem;
    }
    public String getTensv (){
        return this.tensv;
    }
    public String getTelsv(){
        return this.telsv;
    }
    public String getEmailsv(){
        return this.emailsv;
    }
    
    
   

    public SV() {
		
	}
	public SV(String masv, String hodem, String tensv, String telsv, String emailsv) {
		super();
		this.masv = masv;
		this.hodem = hodem;
		this.tensv = tensv;
		this.telsv = telsv;
		this.emailsv = emailsv;
	}
	public int themSV() throws SQLException{
        int result=0;
        if(this.masv==null || this.masv.length()<=0) return 0;
        if(this.tensv==null || this.tensv.length()<=0 || this.hodem==null || this.hodem.length()<=0) return 1;
        String sql ="";
        Connection conn=null;
        Statement statement=null;
        ResultSet rs=null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dburl="jdbc:mysql://localhost:3306/qlsv"; // MySQL
            String username="root"; 	
            String userpass="Nguloz.123";
            conn = DriverManager.getConnection(dburl, username, userpass);

            statement = conn.createStatement();
            //MASV da co trong bang tblSV chua
            sql="SELECT * FROM sv WHERE MASV='"+this.masv+"'" ;
            rs = statement.executeQuery(sql);
            if(!rs.next()){//Thuc hien INSERT INTO
                sql="INSERT INTO sv (MASV, TENSV, HODEM,TELSV,EMAILSV)VALUES ('"+this.masv+"','"+this.tensv+"','"+this.hodem+"'";
                if(this.emailsv!=null && this.emailsv.length()>0) sql=sql+",'"+this.emailsv+"'";
                if(this.telsv!=null && this.telsv.length()>0) sql=sql+",'"+this.telsv+"'";
                sql=sql+")" ;
                if(statement.executeUpdate(sql)>0) result=10;
            }else result = 3;

            rs.close();
            statement.close();
            conn.close();

        }catch(Exception e){
            rs.close();
            statement.close();
            conn.close();
            System.out.println(e.toString());
        }
        return result;
    }//themSV
    
    public int upadteSV() throws SQLException{
        int result=0;
        if(this.masv==null || this.masv.length()<=0) return 0;
        if(this.tensv==null || this.tensv.length()<=0 || this.hodem==null || this.hodem.length()<=0) return 1;
        String sql ="";
        Connection conn=null;
        Statement statement=null;
        ResultSet rs=null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dburl="jdbc:mysql://localhost:3306/qlsv"; // MySQL
            String username="root"; 	
            String userpass="Nguloz.123";
            conn = DriverManager.getConnection(dburl, username, userpass);

            statement = conn.createStatement();
            //MASV da co trong bang tblSV chua
            
            	sql="UPDATE qlsv.sv SET TENSV='"+this.telsv+"', HODEM='"+this.hodem +"'";
            	if(this.emailsv!=null && this.emailsv.length()>0) sql=sql+", EMAILSV='"+this.emailsv+"'";
                if(this.telsv!=null && this.telsv.length()>0) sql=sql+", TELSV='"+this.telsv+"'";
                sql=sql+" WHERE MASV ='"+this.masv+"';";
               
                
            statement.executeUpdate(sql);

            rs.close();
            statement.close();
            conn.close();

        }catch(Exception e){
            rs.close();
            statement.close();
            conn.close();
            System.out.println(e.toString());
        }
        return result;
    }//Update SV
    
    public int deleteSV() throws SQLException{
        int result=0;
        if(this.masv==null || this.masv.length()<=0) return 0;
        String sql ="";
        Connection conn=null;
        Statement statement=null;
        ResultSet rs=null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String dburl="jdbc:mysql://localhost:3306/qlsv"; // MySQL
            String username="root"; 	
            String userpass="Nguloz.123";
            conn = DriverManager.getConnection(dburl, username, userpass);

            statement = conn.createStatement();
             
            sql="DELETE FROM qlsv.sv " +
                " WHERE MASV='" + this.masv + "';";
            
            statement.executeUpdate(sql);
      

            rs.close();
            statement.close();
            conn.close();

        }catch(Exception e){
            rs.close();
            statement.close();
            conn.close();
            System.out.println(e.toString());
        }
        return result;
    }//Delete SV
}
