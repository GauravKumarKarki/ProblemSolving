/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.*;

/**
 *
 * @author PREDATOR
 */
public class JDBC { 
    
        public static void main(String[]args){
        Class.forName("com.mysql.jdbc.Driver"); 
        System.out.println("driver loaded");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:33060/cw","root","G@ur@v2057");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select *from shoesInfo ");
        while(rs.next()){
        System.out.println(rs.getString(2));
        }
        
        con.close();
        }
        
    }
}
