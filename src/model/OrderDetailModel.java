package model;

import entity.OrderDetail;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDetailModel {

    public ArrayList<OrderDetail> getOrderDetailsByOrderId(int orderId) {
        ArrayList<OrderDetail> orderDetails = new ArrayList<>();
        String sql = "SELECT * FROM OrderDetails WHERE OrderID = ?";

        try (Connection conn = connection.getConnection();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setInt(1, orderId);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                int orderDetailID = rs.getInt("OrderDetailID");
                String productID = rs.getString("ProductID");
                int quantity = rs.getInt("Quantity");
                double unitPrice = rs.getDouble("UnitPrice");
                double totalPrice = rs.getDouble("TotalPrice");

                OrderDetail detail = new OrderDetail(orderDetailID, orderId, productID, quantity, unitPrice, totalPrice);
                orderDetails.add(detail);
            }

        } catch (SQLException ex) {
            System.out.println("Error retrieving OrderDetails: " + ex.getMessage());
        }

        return orderDetails;
    }

}
