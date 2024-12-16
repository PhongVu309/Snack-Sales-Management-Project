/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import entity.Product;
import java.util.ArrayList;
import model.Productmodel;

/**
 *
 * @author daica
 */
public class ProductController {
    private Productmodel model;

    public ProductController() {
        model = new Productmodel();
    }
     public int Insert(Product insertProduct) {
        Productmodel DSProductmodel = new Productmodel();
        return DSProductmodel.Insert(insertProduct);
    }

    public boolean Update(Product updateProduct) {
        Productmodel DSProductmodel = new Productmodel();
        return DSProductmodel.Update(updateProduct);
    }
     public boolean Delete(int id) {
        Productmodel DSProductmodel = new Productmodel();
        return DSProductmodel.Delete(id);
    }
     public ArrayList<Product> getAllProducts() {
        Productmodel DSProductmodel = new Productmodel();
        return DSProductmodel.DSProduct();
    }
     public ArrayList<Product> searchProducts(String keyword) {
        return model.searchProducts(keyword);
    }
}
