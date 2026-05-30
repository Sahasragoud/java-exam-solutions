// Basic JDBC Connection 
// • Objective: Connect Java with a relational database. 
// • Task: Connect to a local MySQL/SQLite database and retrieve data. 
// • Instructions: 
// o Set up a database with a students table. 
// o Write code to load the JDBC driver, create a connection, execute a SELECT query, and 
// print results. 

package org.javaclaseses;

import java.sql.*;

public class jdbcCreation {
    public static void main(String[] args) {
        final String url = "jdbc:mysql://localhost:3306/cognizant";
        final String user = "root";
        final String password = "********";
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cn = DriverManager.getConnection(url, user, password);
            System.out.println("Connection is established");

            Statement st = cn.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM students");

            while(rs.next()){
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            cn.close();
        }
        catch(ClassNotFoundException ex){
            System.out.print(ex.getMessage());
        }
        catch(SQLException e){
            System.out.println("Sql error : " + e.getMessage());
        }
    }
}
