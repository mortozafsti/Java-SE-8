
package Invebtory;

import java.util.Date;

public class Service {
    
    private int sid;
    private String name;
    private double unitPrice;
    private double totalproce;
    private Date pruchaseDate;   
    private Catagory catagory;
    private Product product;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    
    
    
}
