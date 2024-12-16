/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entity.Product;
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
public class Productmodel {
    public ArrayList<Product> DSProduct() {
        ArrayList<Product> ListProduct = new ArrayList<>();
        String sql = "SELECT * FROM Products";

        try (Connection conn = connection.getConnection();
             Statement stas = conn.createStatement();
             ResultSet rs = stas.executeQuery(sql)) {

            while (rs.next()) {
                Product tb = new Product(rs.getInt("ProductID"), rs.getString("Name"), rs.getString("Description"), rs.getInt("Price"), rs.getInt("PriceOld"), rs.getInt("StockQuantity"), rs.getInt("CategoryID"));
                ListProduct.add(tb);
            }
        } catch (SQLException ex) {
            System.out.println("Error! " + ex.toString());
        }

        return ListProduct;
    }
    public int Insert(Product insertProduct) {
        PreparedStatement sttm = null;
        Connection conn = null;
        try {
            String sql = "INSERT INTO Products ( Name, Description, Price, PriceOld, StockQuantity, CategoryID) VALUES (?, ?, ?, ?, ?, ?)";
            conn = connection.getConnection();
            sttm = conn.prepareStatement(sql);
            sttm.setString(1, insertProduct.getName());
            sttm.setString(2, insertProduct.getDescription());
            sttm.setInt(3, insertProduct.getPrice());
            sttm.setInt(4, insertProduct.getPriceOld());
            sttm.setInt(5, insertProduct.getStockQuantity());
            sttm.setInt(6, insertProduct.getCategoryID());

            if (sttm.executeUpdate() > 0) {
                System.out.println("Insert thành công");
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Productmodel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (sttm != null) {
                try {
                    sttm.close();
                } catch (SQLException e) {
                    Logger.getLogger(Productmodel.class.getName()).log(Level.SEVERE, null, e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    Logger.getLogger(Productmodel.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
        return -1;
    }


    public boolean Update(Product updateProduct) {
    String sql = "UPDATE Products SET Name = ?, Description = ?, Price = ?,PriceOld = ?, StockQuantity = ?, CategoryID = ? WHERE ProductID = ?";
    try (Connection conn = connection.getConnection();
         PreparedStatement sttm = conn.prepareStatement(sql)) {
        sttm.setString(1, updateProduct.getName());
        sttm.setString(2, updateProduct.getDescription());
        sttm.setInt(3, updateProduct.getPrice());
        sttm.setInt(4, updateProduct.getPriceOld());
        sttm.setInt(5, updateProduct.getStockQuantity());
        sttm.setInt(6, updateProduct.getCategoryID());
        sttm.setInt(7, updateProduct.getProductID());
        return sttm.executeUpdate() > 0;
    } catch (SQLException ex) {
        Logger.getLogger(Productmodel.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}
    public boolean Delete(int ProductID) {
        String sql = "DELETE FROM Products WHERE ProductID = ?";
        try (Connection conn = connection.getConnection();
             PreparedStatement sttm = conn.prepareStatement(sql)) {
            sttm.setInt(1, ProductID);

            if (sttm.executeUpdate() > 0) {
                System.out.println("Delete thành công");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Categorymodel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public ArrayList<Product> searchProducts(String keyword) {
        ArrayList<Product> ListProducts = new ArrayList<>();
        String sql = "SELECT * FROM Products WHERE Name LIKE ?";

        try (Connection conn = connection.getConnection();
             PreparedStatement sttm = conn.prepareStatement(sql)) {
            sttm.setString(1, "%" + keyword + "%");
            ResultSet rs = sttm.executeQuery();

            while (rs.next()) {
                Product product = new Product(rs.getInt("ProductID"), rs.getString("Name"), rs.getString("Description"), rs.getInt("Price"), rs.getInt("PriceOld"), rs.getInt("StockQuantity"), rs.getInt("CategoryID"));
                ListProducts.add(product);
            }
        } catch (SQLException ex) {
            System.out.println("Error! " + ex.toString());
        }

        return ListProducts;
    }
}
