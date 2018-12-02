
package domain;

import java.util.Date;

public class Purchase {
    
    private int id;
    private String productName;
    private String productCode;
    private int productQty;
    private double unitPrice;
    private double totalPrice;
    private Date purchaseDate;

    public Purchase() {
    }

    public Purchase(String productName, String productCode, int productQty, double unitPrice, double totalPrice, Date purchaseDate) {
        this.productName = productName;
        this.productCode = productCode;
        this.productQty = productQty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.purchaseDate = purchaseDate;
    }

    public Purchase(int id, String productName, String productCode, int productQty, double unitPrice, double totalPrice, Date purchaseDate) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.productQty = productQty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.purchaseDate = purchaseDate;
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

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    
    
    
}
