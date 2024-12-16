/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entity.Orders;
import java.util.ArrayList;
import model.Ordermodel;

/**
 *
 * @author daica
 */
public class OrderController {
    public ArrayList<Orders> getOrders() {
        Ordermodel DSOrdermodel = new Ordermodel();
        return DSOrdermodel.DSOrders();
    }
    public int Insert(Orders insertOrder) {
        Ordermodel DSOrdermodel = new Ordermodel();
        return DSOrdermodel.Insert(insertOrder);
    }
    public boolean Update(Orders updateOrder){
        Ordermodel DSOrdermodel = new Ordermodel();
        return DSOrdermodel.Update(updateOrder);
    }
}
