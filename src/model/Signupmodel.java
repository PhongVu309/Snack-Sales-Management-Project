package model;

import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Signupmodel {

    public ArrayList<Account> getAllAccounts() {
        ArrayList<Account> accountList = new ArrayList<>();
        String sql = "SELECT * FROM Account";

        try (Connection conn = connection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Account account = new Account(
                    rs.getString("UserName"),
                    rs.getString("Displayname"),
                    rs.getString("Password"),
                    rs.getInt("Type")
                );
                accountList.add(account);
            }
        } catch (SQLException ex) {
            System.out.println("Error! " + ex.toString());
        }

        return accountList;
    }

    public int Insert(Account insertAccount) {
        PreparedStatement pstmt = null;
        Connection conn = null;
        try {
            String sql = "INSERT INTO Account (UserName, Displayname, Password, Type) VALUES (?, ?, ?, ?)";
            conn = connection.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, insertAccount.getUsername());
            pstmt.setString(2, insertAccount.getDisplayName());
            pstmt.setString(3, insertAccount.getPassword());
            pstmt.setInt(4, insertAccount.getType());

            if (pstmt.executeUpdate() > 0) {
                System.out.println("Insert thành công");
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Signupmodel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    Logger.getLogger(Signupmodel.class.getName()).log(Level.SEVERE, null, e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    Logger.getLogger(Signupmodel.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
        return -1;
    }
}
