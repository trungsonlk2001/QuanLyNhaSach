package Connect;

import java.sql.*;

public class DatabaseHelper {
    private static final String connectionUrl = "jdbc:sqlserver://localhost;"
            +"databaseName=QuanLyBanSach;encrypt=true;trustServerCertificate=true;user=sa;password=12345678";
    
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(connectionUrl);
            return con;            
        } catch (Exception e) {
            System.out.println("Lỗi connect: " + e.toString());
        }
        return null;
    }
}
