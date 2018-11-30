
package Domain;

import java.sql.Date;

public class User {
    
    private int id;
    private String username;
    private String password;
    private String usertype;
    private String gender;  
    private String mobileno;
    private String nid;
    private String address;
    private int admitfee;
    private Date regiDate;
    private boolean status;

    public User() {
    }

    public User(String username, String password, boolean status) {
        this.username = username;
        this.password = password;
        this.status = status;
    }

    public User(String username, String password, String usertype, String gender, String mobileno, String nid, String address, int admitfee, Date regiDate, boolean status) {
        this.username = username;
        this.password = password;
        this.usertype = usertype;
        this.gender = gender;
        this.mobileno = mobileno;
        this.nid = nid;
        this.address = address;
        this.admitfee = admitfee;
        this.regiDate = regiDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAdmitfee() {
        return admitfee;
    }

    public void setAdmitfee(int admitfee) {
        this.admitfee = admitfee;
    }

    public Date getRegiDate() {
        return regiDate;
    }

    public void setRegiDate(Date regiDate) {
        this.regiDate = regiDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
