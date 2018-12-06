
package domain;

import java.util.Date;

public class Purchase {
    
    private int id;
    private String P_code;
    private String P_Name;
    private double P_Qty;
    private double U_Price;
    private double T_Price;
    private Date P_Date;

    public Purchase() {
    }

    public Purchase(String P_code, String P_Name, double P_Qty, double U_Price, double T_Price, Date P_Date) {
        this.P_code = P_code;
        this.P_Name = P_Name;
        this.P_Qty = P_Qty;
        this.U_Price = U_Price;
        this.T_Price = T_Price;
        this.P_Date = P_Date;
    }

    public Purchase(int id, String P_code, String P_Name, double P_Qty, double U_Price, double T_Price, Date P_Date) {
        this.id = id;
        this.P_code = P_code;
        this.P_Name = P_Name;
        this.P_Qty = P_Qty;
        this.U_Price = U_Price;
        this.T_Price = T_Price;
        this.P_Date = P_Date;
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

    public Date getP_Date() {
        return P_Date;
    }

    public void setP_Date(Date P_Date) {
        this.P_Date = P_Date;
    }

    
    
    
}
