
package ChapterTen;

public class Bike {
   
    private String color;
    private int maxSpeed;
    
    public void bikeInfo(){ 
        System.out.println("Bike Color: "+color+"\nMaxSpeed: "+maxSpeed);
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    
}
