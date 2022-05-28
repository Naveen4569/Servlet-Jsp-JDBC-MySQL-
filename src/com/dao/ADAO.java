package com.dao;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;

import com.bean.LoginBean;
@SuppressWarnings("unused")
public class ADAO {

	 private String jdbcURL = "jdbc:mysql://localhost:3306/dank";
	    private String jdbcUsername = "root";
	    private String jdbcPassword = "456123789";
	    private ResultSet count=null;
	
	private static final String select="select * from userdata where uname=? and pass=?";
	public ADAO() {}
	protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);}
        catch(Exception e) {
     
            e.printStackTrace();
        }
        return connection;
    }
	 public String countUser(String u,String s) throws Exception {
         String k=null;
         try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(select);)
         {statement.setString(1, u);
         	statement.setString(2, s);
             ResultSet count =statement.executeQuery();
            
             if(count.next())
             {
            	 k="username:"+count.getString("uname")+"::"+"name:"+count.getString("name")+"::"+"email:"+count.getString("email")+"::"+"country:"+" "+count.getString("country");
             }
             else {
             	return "";
             }
         }
         return k;
     }
	
	
}
