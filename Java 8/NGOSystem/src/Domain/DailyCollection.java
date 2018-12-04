
package Domain;

import java.util.Date;

public class DailyCollection {
    
    private int id;
    private String name;
    private String gender;
    private String address;
    private double collectionAmount;
    private Date collectionDate;
    
    private int day;
    private int month;
    private int year;
    
    private AddMember addMember;

    public DailyCollection() {
    }

    public DailyCollection(String name, String gender, String address, double collectionAmount, Date collectionDate, int day, int month, int year, AddMember addMember) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.collectionAmount = collectionAmount;
        this.collectionDate = collectionDate;
        this.day = day;
        this.month = month;
        this.year = year;
        this.addMember = addMember;
    }

    public DailyCollection(String name, String gender, String address,double collectionAmount, Date collectionDate) {
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.collectionAmount = collectionAmount;
        this.collectionDate = collectionDate;
    }

    public DailyCollection(int id, String name, String gender, String address,double collectionAmount, Date collectionDate, AddMember addMember) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.collectionAmount = collectionAmount;
        this.collectionDate = collectionDate;
        this.addMember = addMember;
    }

    public DailyCollection(String name, String gender, String address,double collectionAmount, Date collectionDate, AddMember addMember) {
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

    public double getCollectionAmount() {
        return collectionAmount;
    }

    public void setCollectionAmount(double collectionAmount) {
        this.collectionAmount = collectionAmount;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
