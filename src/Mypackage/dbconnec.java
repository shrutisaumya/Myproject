/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mypackage;

/**
 *
 * @author Shruti
 */
import java.sql.*;
public class dbconnec {
    
   
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
      
   public static void main(String[] args) {
      Connection conn = null;
      Statement stmt = null;
      try{
      Class.forName("com.mysql.jdbc.Driver");

      System.out.println("Connecting to database...");
      conn = DriverManager.getConnection("jdbc:mysql://localhost/a", "uname", "pwd");
      
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql;
      sql = "SELECT * from EMPLOYEE";
      ResultSet rs = stmt.executeQuery(sql);

      while(rs.next()){
         //Retrieve by column name
         int id  = rs.getInt("ID");
         String name = rs.getString("NAME");
         String address = rs.getString("ADDRESS");

         //Display values
         System.out.print("ID: " + id);
         System.out.print(", Name: " + name);
         System.out.println(", Address: " + address);
      }
      
      rs.close();
      stmt.close();
      conn.close();
      }
      catch(SQLException se){
        se.printStackTrace(); 
   }catch(Exception e){
        e.printStackTrace();
   
}
}
}
    

