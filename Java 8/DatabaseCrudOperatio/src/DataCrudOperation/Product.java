
package DataCrudOperation;

import java.util.Date;

public class Product {
    
    private int p_id;
    private String name;
    private int qty;
    private double unit_price;
    private double total_price;
    private Date purchase_date;
    private Category category;

    public Product() {
    }

    public Product(int p_id, String name, int qty, double unit_price, double total_price, Date purchase_date, Category category) {
        this.p_id = p_id;
        this.name = name;
        this.qty = qty;
        this.unit_price = unit_price;
        this.total_price = total_price;
        this.purchase_date = purchase_date;
        this.category = category;
    }

    
    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
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

    public double getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(double unit_price) {
        this.unit_price = unit_price;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    public Date getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(Date purchase_date) {
        this.purchase_date = purchase_date;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    
    
}
