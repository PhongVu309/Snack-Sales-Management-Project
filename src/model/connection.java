package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author daica
 */
public class connection {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=QlyBanDoAnVat;encrypt=true;trustServerCertificate=true";
    private static final String USER = "sa";
    private static final String PASSWORD = "223003";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Đăng ký driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Thiết lập kết nối
            conn = DriverManager.getConnection(URL, USER, PASSWORD);

            if (conn != null) {
                System.out.println("Kết nối thành công!");
            } else {
                System.out.println("Kết nối thất bại!");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Không tìm thấy driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Lỗi kết nối: " + e.getMessage());
        }
        return conn;
    }
}
