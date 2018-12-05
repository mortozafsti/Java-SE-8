
package domain;

import java.util.Date;

public class Purchase {
    
    private int id;
    private String p_name;
    private double price;
    private Date p_date;

    public Purchase() {
    }

    public Purchase(int id) {
        this.id = id;
    }

    public Purchase(int id, String p_name, double price, Date p_date) {
        this.id = id;
        this.p_name = p_name;
        this.price = price;
        this.p_date = p_date;
    }

    public Purchase(String p_name, double price, Date p_date) {
        this.p_name = p_name;
        this.price = price;
        this.p_date = p_date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getP_date() {
        return p_date;
    }

    public void setP_date(Date p_date) {
        this.p_date = p_date;
    }
    
    
}
