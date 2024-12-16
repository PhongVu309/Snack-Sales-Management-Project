/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import entity.Shipment;
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
 * @author Asus
 */
public class Shipmentmodel {
    public ArrayList<Shipment> DSShipment() {
        ArrayList<Shipment> ListShipment = new ArrayList<>();
        String sql = "SELECT * FROM Shipment";

        try (Connection conn = connection.getConnection();
             Statement stas = conn.createStatement();
             ResultSet rs = stas.executeQuery(sql)) {

            while (rs.next()) {
                Shipment tb = new Shipment(rs.getInt("ShipmentID"), rs.getInt("OrderID"), rs.getString("CustomerName"), rs.getString("Address"), rs.getString("Phone"), rs.getDate("ShippingDate"), rs.getDate("DeliveryDate"));
                ListShipment.add(tb);
            }
        } catch (SQLException ex) {
            System.out.println("Error! " + ex.toString());
        }

        return ListShipment;
    }
    public int Insert(Shipment insertShipment) {
        PreparedStatement sttm = null;
        Connection conn = null;
        try {
            String sql = "INSERT INTO Shipment (OrderID, CustomerName, Address, Phone, ShippingDate, DeliveryDate) VALUES (?, ?, ?, ?, ?, ?)";
            conn = connection.getConnection();
            sttm = conn.prepareStatement(sql);
            sttm.setInt(1, insertShipment.getOrderID());
            sttm.setString(2, insertShipment.getCustomerName());
            sttm.setString(3, insertShipment.getAddress());
            sttm.setString(4, insertShipment.getPhone());
            sttm.setDate(5, (Date) insertShipment.getShippingDate());
            sttm.setDate(6, (Date) insertShipment.getDeliveryDate());

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


    public boolean Update(Shipment updateShipment) {
        String sql = "UPDATE Shipment SET OrderID = ?, CustomerName = ?, Address = ?, Phone = ?, ShippingDate = ?, DeliveryDate = ? WHERE ShipmentID = ?";
        try (Connection conn = connection.getConnection();
             PreparedStatement sttm = conn.prepareStatement(sql)) {
            sttm.setInt(1, updateShipment.getOrderID());
            sttm.setString(2, updateShipment.getCustomerName());
            sttm.setString(3, updateShipment.getAddress());
            sttm.setString(4, updateShipment.getPhone());
            sttm.setDate(5, new java.sql.Date(updateShipment.getShippingDate().getTime()));
            sttm.setDate(6, new java.sql.Date(updateShipment.getDeliveryDate().getTime()));
            sttm.setInt(7, updateShipment.getShipmentID()); // Đảm bảo thiết lập giá trị cho ShipmentID
            return sttm.executeUpdate() > 0;
        } catch (SQLException ex) {
            Logger.getLogger(Productmodel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public boolean Delete(int ShipmentID) {
        String sql = "DELETE FROM Shipment WHERE ShipmentID = ?";
        try (Connection conn = connection.getConnection();
             PreparedStatement sttm = conn.prepareStatement(sql)) {
            sttm.setInt(1, ShipmentID);

            if (sttm.executeUpdate() > 0) {
                System.out.println("Delete thành công");
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Categorymodel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public ArrayList<Shipment> searchShipment(String keyword) {
        ArrayList<Shipment> ListShipment = new ArrayList<>();
        String sql = "SELECT * FROM Shipment WHERE CustomerName LIKE ?";

        try (Connection conn = connection.getConnection();
             PreparedStatement sttm = conn.prepareStatement(sql)) {
            sttm.setString(1, "%" + keyword + "%");
            ResultSet rs = sttm.executeQuery();

            while (rs.next()) {
                Shipment shipment = new Shipment(rs.getInt("ShipmentID"), rs.getInt("OrderID"), rs.getString("CustomerName"), rs.getString("Address"), rs.getString("Phone"), rs.getDate("ShippingDate"), rs.getDate("DeliveryDate"));
                ListShipment.add(shipment);
            }
        } catch (SQLException ex) {
            System.out.println("Error! " + ex.toString());
        }

        return ListShipment;
    }
}
