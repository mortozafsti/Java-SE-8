package Domain;

import java.util.Date;

public class AddMember {

    private int id;
    private String mcode;
    private String name;
    private String gender;
    private String mobileno;
    private String nid;
    private String address;
    private String admitfee;
    private Date regiDate;

    public AddMember() {
    }

    public AddMember(String mcode, String name, String gender, String mobileno, String nid, String address, String admitfee, Date regiDate) {
        this.mcode = mcode;
        this.name = name;
        this.gender = gender;
        this.mobileno = mobileno;
        this.nid = nid;
        this.address = address;
        this.admitfee = admitfee;
        this.regiDate = regiDate;
    }

    public AddMember(int id, String mcode, String name, String gender, String mobileno, String nid, String address, String admitfee, Date regiDate) {
        this.id = id;
        this.mcode = mcode;
        this.name = name;
        this.gender = gender;
        this.mobileno = mobileno;
        this.nid = nid;
        this.address = address;
        this.admitfee = admitfee;
        this.regiDate = regiDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMcode() {
        return mcode;
    }

    public void setMcode(String mcode) {
        this.mcode = mcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAdmitfee() {
        return admitfee;
    }

    public void setAdmitfee(String admitfee) {
        this.admitfee = admitfee;
    }

    public Date getRegiDate() {
        return regiDate;
    }

    public void setRegiDate(Date regiDate) {
        this.regiDate = regiDate;
    }

    

}
