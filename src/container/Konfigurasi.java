package container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Konfigurasi {
    private static Connection MySQLConfig;
    
    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/adminParkir";
            String user = "root";
            String password = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, password);
        } 
        catch (SQLException e) {
            System.out.println("Koneksi ke basis data gagal !!! " + e.getMessage());
        }
        return MySQLConfig;
    }
}
