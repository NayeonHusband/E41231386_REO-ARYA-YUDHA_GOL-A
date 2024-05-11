/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.w11;

/**
 *
 * @author User
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class dbs {
    private static Connection koneksi;
    public static Connection getConnection() throws SQLException{
        if (koneksi==null){
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/penjualan","root","");
        }
        return koneksi;
    }
}
