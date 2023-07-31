/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prepus;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author HP
 */
public class koneksi {
    private Connection konek;
    public Connection getConnection(){
        return konek;
    }
    public void koneksiDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try{
                String url, user, pw;
                url = "jdbc:mysql://localhost:3306/perpus";
                user = "root";
                pw = "";
                
                konek = DriverManager.getConnection(url,user,pw);
                
                System.out.println("Koneksi sukses");
            }
            catch(Exception e){
                System.out.println("koneksi gagal");
            }
        }
        catch(Exception e){
            System.out.println("Driver tidak ditemukan");
        }
    }
    public static void main(String [] args){
        new koneksi().koneksiDB();
    }
}