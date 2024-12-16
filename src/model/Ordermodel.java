/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entity.Orders;
import java.sql.Connection;
import java.sql.Date;
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
public class Ordermodel {
    public ArrayList<Orders> DSOrders() {
        ArrayList<Orders> ListOrders = new ArrayList<>();
        String sql = "SELECT * FROM Orders";

        try (Connection conn = connection.getConnection();
             Statement stas = conn.createStatement();
             ResultSet rs = stas.executeQuery(sql)) {

            while (rs.next()) {
                Orders tb = new Orders(rs.getInt("OrderID"), rs.getDate("OrderDate"), rs.getFloat("TotalAmount"), rs.getString("Status"));
                ListOrders.add(tb);
            }
        } catch (SQLException ex) {
            System.out.println("Error! " + ex.toString());
        }

        return ListOrders;
    }
    public int Insert(Orders insertOrder) {
        PreparedStatement sttm = null;
        Connection conn = null;
        try {
            String sql = "INSERT INTO Orders(OrderDate, Status) VALUES (?, ?)";
            conn = connection.getConnection();
            sttm = conn.prepareStatement(sql);
            sttm.setDate(1, (Date) insertOrder.getOrderDate());
            sttm.setString(2, insertOrder.getStatus());

            if (sttm.executeUpdate() > 0) {
                System.out.println("Insert thành công");
                return 1;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Ordermodel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (sttm != null) {
                try {
                    sttm.close();
                } catch (SQLException e) {
                    Logger.getLogger(Ordermodel.class.getName()).log(Level.SEVERE, null, e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    Logger.getLogger(Ordermodel.class.getName()).log(Level.SEVERE, null, e);
                }
            }
        }
        return -1;
    }
    
    public boolean Update(Orders updateOrder){
        PreparedStatement sttm = null;
        Connection conn = null;
        try {
            String sql = "Update Orders set OrderDate = ?, Status = ? where OrderID = ?";
            conn = connection.getConnection();
            sttm = conn.prepareStatement(sql);
            sttm.setDate(1, new java.sql.Date(updateOrder.getOrderDate().getTime()));
            sttm.setString(2, updateOrder.getStatus());
            sttm.setInt(3, updateOrder.getOrderID());
            return sttm.executeUpdate() > 0;
        }
        catch (SQLException ex) {
            Logger.getLogger(Productmodel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
}
    
}
