/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entity.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daica
 */
public class Categorymodel {
    public ArrayList<Category> DSCategory() {
        ArrayList<Category> ListCategory = new ArrayList<>();
        String sql = "SELECT * FROM Categories";

        try (Connection conn = connection.getConnection();
             Statement stas = conn.createStatement();
             ResultSet rs = stas.executeQuery(sql)) {

            while (rs.next()) {
                Category tb = new Category(rs.getInt("CategoryID"), rs.getString("Name"), rs.getString("Description"));
                ListCategory.add(tb);
            }
        } catch (SQLException ex) {
            System.out.println("Error! " + ex.toString());
        }

        return ListCategory;
    }
    public int Insert(Category insertCategory) {
        PreparedStatement sttm = null;
        Connection conn = null;
        try {
            String sql = "INSERT INTO Categories(Name, Description) VALUES (?, ?)";
            conn = connection.getConnection();
            sttm = conn.prepareStatement(sql);
            sttm.setString(1, insertCategory.getName());
            sttm.setString(2, insertCategory.getDescription());

            if (sttm.executeUpdate() > 0) {
                System.out.println("Insert thành công");
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Categorymodel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (sttm != null) {
                try {
                    sttm.close();
                } catch (SQLException e) {
                    Logger.getLogger(Categorymodel.class.getName()).log(Level.SEVERE, null, e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    Logger.getLogger(Categorymodel.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
        return -1;
    }


    public boolean Update(Category updateCategory) {
    String sql = "UPDATE Categories SET Name = ?, Description = ? WHERE CategoryID = ?";
    try (Connection conn = connection.getConnection();
         PreparedStatement sttm = conn.prepareStatement(sql)) {
        sttm.setString(1, updateCategory.getName());
        sttm.setString(2, updateCategory.getDescription());
        sttm.setInt(3, updateCategory.getCategoryID());
        return sttm.executeUpdate() > 0;
    } catch (SQLException ex) {
        Logger.getLogger(Categorymodel.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}


    public boolean Delete(int CategoryID) {
        String sql = "DELETE FROM Categories WHERE CategoryID = ?";
        try (Connection conn = connection.getConnection();
             PreparedStatement sttm = conn.prepareStatement(sql)) {
            sttm.setInt(1, CategoryID);

            if (sttm.executeUpdate() > 0) {
                System.out.println("Delete thành công");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Categorymodel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public ArrayList<Category> searchCategories(String keyword) {
        ArrayList<Category> ListCategory = new ArrayList<>();
        String sql = "SELECT * FROM Categories WHERE Name LIKE ? OR Description LIKE ?";

        try (Connection conn = connection.getConnection();
             PreparedStatement sttm = conn.prepareStatement(sql)) {
            sttm.setString(1, "%" + keyword + "%");
            sttm.setString(2, "%" + keyword + "%");
            ResultSet rs = sttm.executeQuery();

            while (rs.next()) {
                Category category = new Category(rs.getInt("CategoryID"), rs.getString("Name"), rs.getString("Description"));
                ListCategory.add(category);
            }
        } catch (SQLException ex) {
            System.out.println("Error! " + ex.toString());
        }

        return ListCategory;
    }
}
