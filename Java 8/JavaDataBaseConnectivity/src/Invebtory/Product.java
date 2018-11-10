
package Invebtory;

import java.util.Date;

public class Product {
    
    private int id;
    private String name;
    private int qty;
    private double unitPrice;
    private double totalproce;
    private Date pruchaseDate;
    private Catagory catagory;

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalproce() {
        return totalproce;
    }

    public void setTotalproce(double totalproce) {
        this.totalproce = totalproce;
    }

    public Date getPruchaseDate() {
        return pruchaseDate;
    }

    public void setPruchaseDate(Date pruchaseDate) {
        this.pruchaseDate = pruchaseDate;
    }

    public Catagory getCatagory() {
        return catagory;
    }

    public void setCatagory(Catagory catagory) {
        this.catagory = catagory;
    }

}
