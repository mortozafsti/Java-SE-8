
package ExamFour;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rd = new Random();
        
        for (int i = 0; i < 10; i++) {
            int dd = rd.nextInt(90)+10;
            System.out.println(" "+dd);
        }
    }
}
