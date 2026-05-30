package org.javaclaseses;

import java.sql.*;

public class JdbcInsertion {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/cognizant";
        String username ="root";
        String password = "Sahasra@04";

        try{        
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection cn = DriverManager.getConnection(url, username, password);

            int id = 5;
            String name = "Smrithi mandana";
            String query = "insert into students values (?, ?, ?, ?)";
            PreparedStatement st = cn.prepareStatement(query);
            
            st.setInt(1, id);
            st.setString(2, name);
            st.setInt(3, 25);
            st.setString(4, "A");
            int count = st.executeUpdate();

            System.out.println(count + "row/s affected");
            st.close();
            cn.close();
            
        }
        catch(ClassNotFoundException ex){
            System.out.println("Driver Not found : " + ex.getMessage());
        }
        catch(SQLException ex){
            System.out.println("Sql Error" + ex.getMessage());
        }
    }
}
