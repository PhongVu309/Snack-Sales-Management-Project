/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;

/**
 *
 * @author daica
 */
public class Orders {
    private int OrderID;
    private Date OrderDate;
    private float TotalAmount;
    private String Status;

    public Orders() {
    }

    public Orders(int OrderID, Date OrderDate, float TotalAmount, String Status) {
        this.OrderID = OrderID;
        this.OrderDate = OrderDate;
        this.TotalAmount = TotalAmount;
        this.Status = Status;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public Date getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public float getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(float TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "Orders{" + "OrderID=" + OrderID + ", OrderDate=" + OrderDate + ", TotalAmount=" + TotalAmount + ", Status=" + Status + '}';
    }
    
}
