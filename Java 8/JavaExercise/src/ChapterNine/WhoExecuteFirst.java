
package ChapterNine;

public class WhoExecuteFirst {
    public static void main(String[] args) {
        
        WhoExecuteFirst d = new WhoExecuteFirst();
        System.out.println("I am Main Method block"); 
        
    }

    public WhoExecuteFirst() {
        System.out.println("I am  Constractor Block");
    }
    static{ 
        System.out.println("HI I am  Static Block");
    }
} 
