
package Exercise;

import java.util.Random;

/**
 *
 * @author Cf-37
 */
public class FourPointFive {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1; i <= 10; i++) {
            int number =r.nextInt(21)+34;
            System.out.println("The Resut is: "+number);
        }
        
        String s1 = "Mortoza";
        String s2 = "Mortoza";
        
        if (s1.equals(s2)) {
            System.out.println("True");
        }else{ 
            System.out.println("False");
        }
    }
}
