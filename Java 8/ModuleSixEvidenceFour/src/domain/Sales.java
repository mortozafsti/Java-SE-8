
package domain;

import java.util.Date;

public class Sales {
    
    private int id;
    private String productName;
    private String productCode;
    private int productQty;
    private double unitPrice;
    private double totalPrice;
    private Date salesDate;
    
    Purchase purchase;

    public Sales() {
    }

    public Sales(String productName, String productCode, int productQty, double unitPrice, double totalPrice, Date salesDate, Purchase purchase) {
        this.productName = productName;
        this.productCode = productCode;
        this.productQty = productQty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.salesDate = salesDate;
        this.purchase = purchase;
    }

    public Sales(String productCode, int productQty, double unitPrice, double totalPrice, Date salesDate) {
        this.productCode = productCode;
        this.productQty = productQty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.salesDate = salesDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getProductQty() {
        return productQty;
    }

    public void setProductQty(int productQty) {
        this.productQty = productQty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(Date salesDate) {
        this.salesDate = salesDate;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    
    
    
}
