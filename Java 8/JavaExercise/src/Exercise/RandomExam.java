
package Exercise;

import java.util.Random;

/**
 *
 * @author User
 */
public class RandomExam {
    public static void main(String[] args) {
        Random r = new Random();
        
        for (int i = 1; i <= 10; i++) {
            int randomnumber = r.nextInt(45)+5;
            System.out.println("Num is: "+i+" : "+randomnumber);
        }
    }
}
