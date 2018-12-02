
package domain;

import java.util.Date;

public class purchase {
    
    private int id;
    private String pname;
    private String pcode;
    private int qty;
    private double uprice;
    private double tprice;
    private Date pdate;

    public purchase() {
    }

    public purchase(String pname, String pcode, int qty, double uprice, double tprice, Date pdate) {
        this.pname = pname;
        this.pcode = pcode;
        this.qty = qty;
        this.uprice = uprice;
        this.tprice = tprice;
        this.pdate = pdate;
    }

    public purchase(int id, String pname, String pcode, int qty, double uprice, double tprice, Date pdate) {
        this.id = id;
        this.pname = pname;
        this.pcode = pcode;
        this.qty = qty;
        this.uprice = uprice;
        this.tprice = tprice;
        this.pdate = pdate;
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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUprice() {
        return uprice;
    }

    public void setUprice(double uprice) {
        this.uprice = uprice;
    }

    public double getTprice() {
        return tprice;
    }

    public void setTprice(double tprice) {
        this.tprice = tprice;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }
    
    
}
