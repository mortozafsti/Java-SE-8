
package Domain;

import java.util.Date;

public class DailyCollection {
    
    private int id;
    private String name;
    private String gender;
    private String address;
    private String collectionAmount;
    private Date collectionDate;
    
    private AddMember addMember;

    public DailyCollection() {
    }

    public DailyCollection(String name, String gender, String address,String collectionAmount, Date collectionDate) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.collectionAmount = collectionAmount;
        this.collectionDate = collectionDate;
    }

    public DailyCollection(int id, String name, String gender, String address,String collectionAmount, Date collectionDate, AddMember addMember) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.collectionAmount = collectionAmount;
        this.collectionDate = collectionDate;
        this.addMember = addMember;
    }

    public DailyCollection(String name, String gender, String address,String collectionAmount, Date collectionDate, AddMember addMember) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.collectionAmount = collectionAmount;
        this.collectionDate = collectionDate;
        this.addMember = addMember;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCollectionDate() {
        return collectionDate;
    }

    public void setCollectionDate(Date collectionDate) {
        this.collectionDate = collectionDate;
    }

    public AddMember getAddMember() {
        return addMember;
    }

    public void setAddMember(AddMember addMember) {
        this.addMember = addMember;
    }  

    public String getCollectionAmount() {
        return collectionAmount;
    }

    public void setCollectionAmount(String collectionAmount) {
        this.collectionAmount = collectionAmount;
    }
    
}
