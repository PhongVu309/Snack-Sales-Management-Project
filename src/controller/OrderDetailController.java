package controller;

import entity.OrderDetail;
import model.OrderDetailModel;
import java.util.ArrayList;

public class OrderDetailController {

    private OrderDetailModel orderDetailModel;

    public OrderDetailController() {
        this.orderDetailModel = new OrderDetailModel();
    }

    public ArrayList<OrderDetail> getOrderDetailsByOrderId(int orderId) {
        return orderDetailModel.getOrderDetailsByOrderId(orderId);
    }
}
