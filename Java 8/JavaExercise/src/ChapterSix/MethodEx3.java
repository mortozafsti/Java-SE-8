
package ChapterSix;

/**
 *
 * @author User
 */
public class MethodEx3 {
    public static void main(String[] args) {
        //Call directly
        display();
        
        //called through object to class
        MethodEx3 nn = new MethodEx3();
        nn.display2();
        
        //calleed static method Way 2
        MethodEx3.display();
        
    }
    public static void display(){
        System.out.println("I am Void Type");
    }
    public void display2(){
        System.out.println("I am Void Type 2");
    }
}
