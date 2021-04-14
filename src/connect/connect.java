/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect;
import java.sql.*;
/**
 *
 * @author Asus
 */
public class connect {
    Connection con = null;
    public Connection getConnecDB(){
        try {
            String dbUrl = "jdbc:jtds:sqlserver://NHUY:1433/HANG_HOA";
            con = DriverManager.getConnection(dbUrl);
            System.out.println("thành công");
        } catch (SQLException e) {
            System.out.println("không kết nối được");
        }
        return con;
    }
}
