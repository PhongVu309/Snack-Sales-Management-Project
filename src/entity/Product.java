/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author daica
 */
public class Product {
    private int ProductID;
    private String Name;
    private String Description;
    private int Price;
    private int PriceOld;
    private int StockQuantity;
    private int CategoryID;

    public Product() {
    }

    public Product(int ProductID, String Name, String Description, int Price, int PriceOld, int StockQuantity, int CategoryID) {
        this.ProductID = ProductID;
        this.Name = Name;
        this.Description = Description;
        this.Price = Price;
        this.PriceOld = PriceOld;
        this.StockQuantity = StockQuantity;
        this.CategoryID = CategoryID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public int getPriceOld() {
        return PriceOld;
    }

    public void setPriceOld(int PriceOld) {
        this.PriceOld = PriceOld;
    }

    public int getStockQuantity() {
        return StockQuantity;
    }

    public void setStockQuantity(int StockQuantity) {
        this.StockQuantity = StockQuantity;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }

    @Override
    public String toString() {
        return "Product{" + "ProductID=" + ProductID + ", Name=" + Name + ", Description=" + Description + ", Price=" + Price + ", PriceOld=" + PriceOld + ", StockQuantity=" + StockQuantity + ", CategoryID=" + CategoryID + '}';
    }
    
}
