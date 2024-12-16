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
public class Shipment {
    private int ShipmentID;
    private int OrderID;
    private String CustomerName;
    private String Address;
    private String Phone;
    private Date ShippingDate;
    private Date DeliveryDate;

    public Shipment() {
    }

    public Shipment(int ShipmentID, int OrderID, String CustomerName, String Address, String Phone, Date ShippingDate, Date DeliveryDate) {
        this.ShipmentID = ShipmentID;
        this.OrderID = OrderID;
        this.CustomerName = CustomerName;
        this.Address = Address;
        this.Phone = Phone;
        this.ShippingDate = ShippingDate;
        this.DeliveryDate = DeliveryDate;
    }

    public int getShipmentID() {
        return ShipmentID;
    }

    public void setShipmentID(int ShipmentID) {
        this.ShipmentID = ShipmentID;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public Date getShippingDate() {
        return ShippingDate;
    }

    public void setShippingDate(Date ShippingDate) {
        this.ShippingDate = ShippingDate;
    }

    public Date getDeliveryDate() {
        return DeliveryDate;
    }

    public void setDeliveryDate(Date DeliveryDate) {
        this.DeliveryDate = DeliveryDate;
    }

    @Override
    public String toString() {
        return "Shipment{" + "ShipmentID=" + ShipmentID + ", OrderID=" + OrderID + ", CustomerName=" + CustomerName + ", Address=" + Address + ", Phone=" + Phone + ", ShippingDate=" + ShippingDate + ", DeliveryDate=" + DeliveryDate + '}';
    }
    
}
