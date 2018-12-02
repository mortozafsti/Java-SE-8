
package domain;

import java.util.Date;

public class Purchase {
    
    private int id;
    private String pName;
    private String pCode;
    private int pqty;
    private double uPrice;
    private double tPrice;
    private Date pDate;

    public Purchase() {
    }

    public Purchase(String pName, String pCode, int pqty, double uPrice, double tPrice, Date pDate) {
        this.pName = pName;
        this.pCode = pCode;
        this.pqty = pqty;
        this.uPrice = uPrice;
        this.tPrice = tPrice;
        this.pDate = pDate;
    }

    public Purchase(int id, String pName, String pCode, int pqty, double uPrice, double tPrice, Date pDate) {
        this.id = id;
        this.pName = pName;
        this.pCode = pCode;
        this.pqty = pqty;
        this.uPrice = uPrice;
        this.tPrice = tPrice;
        this.pDate = pDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public int getPqty() {
        return pqty;
    }

    public void setPqty(int pqty) {
        this.pqty = pqty;
    }

    public double getuPrice() {
        return uPrice;
    }

    public void setuPrice(double uPrice) {
        this.uPrice = uPrice;
    }

    public double gettPrice() {
        return tPrice;
    }

    public void settPrice(double tPrice) {
        this.tPrice = tPrice;
    }

    public Date getpDate() {
        return pDate;
    }

    public void setpDate(Date pDate) {
        this.pDate = pDate;
    }
    
    
}
