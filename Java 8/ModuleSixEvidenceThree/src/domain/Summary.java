
package domain;

import java.util.Date;

public class Summary {
    
    private int id;
    private String pname;
    private String pcode;
    private int totalQty;
    private int soldQty;
    private int availQty;
    private Date lastUpdate;
    
    purchase purchase;

    public Summary() {
    }

    public Summary(String pname, String pcode, int totalQty, int soldQty, int availQty, Date lastUpdate, purchase purchase) {
        this.pname = pname;
        this.pcode = pcode;
        this.totalQty = totalQty;
        this.soldQty = soldQty;
        this.availQty = availQty;
        this.lastUpdate = lastUpdate;
        this.purchase = purchase;
    }

    public Summary(int id, String pname, String pcode, int totalQty, int soldQty, int availQty, Date lastUpdate, purchase purchase) {
        this.id = id;
        this.pname = pname;
        this.pcode = pcode;
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

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
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

    public purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(purchase purchase) {
        this.purchase = purchase;
    }

    
    
}
