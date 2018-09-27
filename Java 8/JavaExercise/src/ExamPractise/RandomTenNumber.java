
package ExamPractise;

import java.util.Random;

public class RandomTenNumber {
    public static void main(String[] args) {
        Random rand = new Random(100);
        
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(90)+10;
            System.out.println(num+" ");
        }
    }
}
