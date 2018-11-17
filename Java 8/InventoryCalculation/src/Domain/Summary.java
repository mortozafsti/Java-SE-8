
package Domain;

import java.util.Date;

public class Summary {

    private int id;
    private String productName;
    private String productCode;
    private int totalqty;
    private int soldqty;
    private int availableqty;
    private Date lastUpdate;
    
    private Purchase purchase;

    public Summary() {
    }

    public Summary(String productName, String productCode, int totalqty, int soldqty, int availableqty, Date lastUpdate, Purchase purchase) {
        this.productName = productName;
        this.productCode = productCode;
        this.totalqty = totalqty;
        this.soldqty = soldqty;
        this.availableqty = availableqty;
        this.lastUpdate = lastUpdate;
        this.purchase = purchase;
    }

    public Summary(String productCode, int totalqty, int soldqty, int availableqty, Date lastUpdate) {
        this.productCode = productCode;
        this.totalqty = totalqty;
        this.soldqty = soldqty;
        this.availableqty = availableqty;
        this.lastUpdate = lastUpdate;
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

    public int getTotalqty() {
        return totalqty;
    }

    public void setTotalqty(int totalqty) {
        this.totalqty = totalqty;
    }

    public int getSoldqty() {
        return soldqty;
    }

    public void setSoldqty(int soldqty) {
        this.soldqty = soldqty;
    }

    public int getAvailableqty() {
        return availableqty;
    }

    public void setAvailableqty(int availableqty) {
        this.availableqty = availableqty;
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
