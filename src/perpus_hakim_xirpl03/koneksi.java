/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus_hakim_xirpl03;

/**
 *
 * @author Hakim
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import sun.applet.Main;

public class koneksi {
    private static Connection mysqlconfig;
    public static Connection koneksi() throws SQLException{
        try{
            String url = "jdbc:mysql://localhost/perpustakaan";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig = DriverManager.getConnection(url, user, pass);
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return mysqlconfig;
    }
}
