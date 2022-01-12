/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

//import com.sun.jdi.connect.spi.Connection;

public class koneksiDb07364 {
    public static Statement stmt = null;
    public static ResultSet rs;
    public static Connection getconnection(){
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/db_gudangspt07346";
        String user = "root";
        String pass = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Berhasil Koneksi Database");
           
        }catch(Exception e){
            System.out.println("Gagal Koneksi Database");
            e.printStackTrace();
        }
        return conn;
    }
}
