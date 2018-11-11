
package InventoryExample;

import java.util.Date;

public class Product {
    
    private int p_id;
    private String p_name;
    private int p_qty;
    private double unit_price;
    private double total_price;
    private Date purchase_date;
    private Category category;

    public Product() {
    }

    public Product(int p_id, String p_name, int p_qty, double unit_price, double total_price, Date purchase_date, Category category) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_qty = p_qty;
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

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public int getP_qty() {
        return p_qty;
    }

    public void setP_qty(int p_qty) {
        this.p_qty = p_qty;
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
