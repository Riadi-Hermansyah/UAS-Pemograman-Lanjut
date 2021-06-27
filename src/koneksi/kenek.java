
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class kenek {
    static Connection Koneksi;
    public static Connection getConnection(){
        try{
            Koneksi = DriverManager.getConnection("jdbc:mysql://localhost/data_mhs","root","");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Koneksi Database Gagal");  
        }
     return Koneksi;   
    } 
}
