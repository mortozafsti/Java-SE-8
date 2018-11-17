
package Domain;

import java.util.Date;

public class Purchase {

    private int id;
    private String productName;
    private String productCode;
    private int qty;
    private double unitProce;
    private double totalProce;
    private Date purchaseDate;

    public Purchase() {
    }

    public Purchase(String productName, String productCode, int qty, double unitProce, double totalProce, Date purchaseDate) {
        this.productName = productName;
        this.productCode = productCode;
        this.qty = qty;
        this.unitProce = unitProce;
        this.totalProce = totalProce;
        this.purchaseDate = purchaseDate;
    }

    public Purchase(int id, String productName, String productCode, int qty, double unitProce, double totalProce, Date purchaseDate) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.qty = qty;
        this.unitProce = unitProce;
        this.totalProce = totalProce;
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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitProce() {
        return unitProce;
    }

    public void setUnitProce(double unitProce) {
        this.unitProce = unitProce;
    }

    public double getTotalProce() {
        return totalProce;
    }

    public void setTotalProce(double totalProce) {
        this.totalProce = totalProce;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
    
    
    
}
