/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC.helper;
import java.sql.*;

/**
 *
 * @author ACER
 */
public class Koneksi {
    private String url="jdbc:mysql://localhost:3306/akademik";
    private String username="root";
    private String password="";
    
    public Connection getKoneksi() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection(url,username,password);
        
    }
}
