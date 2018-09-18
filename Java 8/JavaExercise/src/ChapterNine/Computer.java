package ChapterNine;

public class Computer {

    int serialNumber;
    String brand;

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static void main(String[] args) {
        Computer cm = new Computer();
        cm.setSerialNumber(1548963);
        cm.setBrand("Lenevo");

        System.out.println("Serial Number: " + cm.getSerialNumber());
        System.out.println("Brand: " + cm.getBrand());
    }

}
