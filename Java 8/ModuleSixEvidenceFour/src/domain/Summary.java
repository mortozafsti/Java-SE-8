
package domain;

import java.util.Date;

public class Summary {
    
    private int id;
    private String productName;
    private String productCode;
    private int totalQty;
    private int soldQty;
    private int availQty;
    private Date lastUpDate;
    
    Purchase purchase;

    public Summary() {
    }

    public Summary(String productName, String productCode, int totalQty, int soldQty, int availQty, Date lastUpDate, Purchase purchase) {
        this.productName = productName;
        this.productCode = productCode;
        this.totalQty = totalQty;
        this.soldQty = soldQty;
        this.availQty = availQty;
        this.lastUpDate = lastUpDate;
        this.purchase = purchase;
    }

    public Summary(int id, String productName, String productCode, int totalQty, int soldQty, int availQty, Date lastUpDate, Purchase purchase) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.totalQty = totalQty;
        this.soldQty = soldQty;
        this.availQty = availQty;
        this.lastUpDate = lastUpDate;
        this.purchase = purchase;
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

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
    }

    public int getSoldQty() {
        return soldQty;
    }

    public void setSoldQty(int soldQty) {
        this.soldQty = soldQty;
    }

    public int getAvailQty() {
        return availQty;
    }

    public void setAvailQty(int availQty) {
        this.availQty = availQty;
    }

    public Date getLastUpDate() {
        return lastUpDate;
    }

    public void setLastUpDate(Date lastUpDate) {
        this.lastUpDate = lastUpDate;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    
    
    
}
