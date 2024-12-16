/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entity.Shipment;
import java.util.ArrayList;
import model.Shipmentmodel;

/**
 *
 * @author Asus
 */
public class ShipmentController {
    private Shipmentmodel model;

    public ShipmentController() {
        model = new Shipmentmodel();
    }
     public int Insert(Shipment insertShipment) {
        Shipmentmodel DSShipmentmodel = new Shipmentmodel();
        return DSShipmentmodel.Insert(insertShipment);
    }

    public boolean Update(Shipment updateShipment) {
        Shipmentmodel DSShipmentmodel = new Shipmentmodel();
        return DSShipmentmodel.Update(updateShipment);
    }
     public boolean Delete(int id) {
        Shipmentmodel DSShipmentmodel = new Shipmentmodel();
        return DSShipmentmodel.Delete(id);
    }
     public ArrayList<Shipment> getAllProducts() {
        Shipmentmodel DSShipmentmodel = new Shipmentmodel();
        return DSShipmentmodel.DSShipment();
    }
     public ArrayList<Shipment> searchShipment(String keyword) {
        return model.searchShipment(keyword);
    }
}
