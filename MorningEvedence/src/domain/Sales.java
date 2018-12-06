
package domain;

import java.util.Date;

public class Sales {
    
    private int id;
    private String P_code;
    private String P_Name;
    private double P_Qty;
    private double U_Price;
    private double T_Price;
    private Date S_Date;

    Purchase purchase;
    
    public Sales() {
    }

    public Sales(String P_code, String P_Name, double P_Qty, double U_Price, double T_Price, Date S_Date, Purchase purchase) {
        this.P_code = P_code;
        this.P_Name = P_Name;
        this.P_Qty = P_Qty;
        this.U_Price = U_Price;
        this.T_Price = T_Price;
        this.S_Date = S_Date;
        this.purchase = purchase;
    }

    public Sales(int id, String P_code, String P_Name, double P_Qty, double U_Price, double T_Price, Date S_Date, Purchase purchase) {
        this.id = id;
        this.P_code = P_code;
        this.P_Name = P_Name;
        this.P_Qty = P_Qty;
        this.U_Price = U_Price;
        this.T_Price = T_Price;
        this.S_Date = S_Date;
        this.purchase = purchase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getP_code() {
        return P_code;
    }

    public void setP_code(String P_code) {
        this.P_code = P_code;
    }

    public String getP_Name() {
        return P_Name;
    }

    public void setP_Name(String P_Name) {
        this.P_Name = P_Name;
    }

    public double getP_Qty() {
        return P_Qty;
    }

    public void setP_Qty(double P_Qty) {
        this.P_Qty = P_Qty;
    }

    public double getU_Price() {
        return U_Price;
    }

    public void setU_Price(double U_Price) {
        this.U_Price = U_Price;
    }

    public double getT_Price() {
        return T_Price;
    }

    public void setT_Price(double T_Price) {
        this.T_Price = T_Price;
    }

    public Date getS_Date() {
        return S_Date;
    }

    public void setS_Date(Date S_Date) {
        this.S_Date = S_Date;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    

    
    
    
}
