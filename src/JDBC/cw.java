/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC; 
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.*;



/**
 *
 * @author PREDATOR
 */
public class cw {
    public static void main(String[]args) {
MysqlDataSource dataSource = new MysqlDataSource();
dataSource.setUser("root");
dataSource.setPassword("G@ur@v2057");
dataSource.setServerName("jdbc:mysql://localhost:3306/cw");


Connection conn = dataSource.getConnection();
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT *from cw");

rs.close();
stmt.close();
conn.close();

    }
}
