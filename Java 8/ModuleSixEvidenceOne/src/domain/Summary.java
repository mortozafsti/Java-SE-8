
package domain;

import java.util.Date;

public class Summary {
    
    private int id;
    private String productName;
    private String productCode;
    private int totalQty;
    private int soldQty;
    private int availQty;
    private Date lastUpdate;
    
    Purchase purchase;

    public Summary() {
    }

    public Summary(String productCode, int totalQty, int soldQty, int availQty, Date lastUpdate) {
        this.productCode = productCode;
        this.totalQty = totalQty;
        this.soldQty = soldQty;
        this.availQty = availQty;
        this.lastUpdate = lastUpdate;
    }

    public Summary(String productName, String productCode, int totalQty, int soldQty, int availQty, Date lastUpdate, Purchase purchase) {
        this.productName = productName;
        this.productCode = productCode;
        this.totalQty = totalQty;
        this.soldQty = soldQty;
        this.availQty = availQty;
        this.lastUpdate = lastUpdate;
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

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }
    
}
