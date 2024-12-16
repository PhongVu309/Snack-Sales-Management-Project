package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DatabaseHelper {

    public static int getUserType(String username, String password) {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    int type = -1;

    try {
        conn = connection.getConnection();
        String sql = "SELECT Type FROM Account WHERE Username = ? AND Password = ?";
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, username);
        stmt.setString(2, password);

        rs = stmt.executeQuery();

        if (rs.next()) {
            type = rs.getInt("Type");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    return type;
}
}
