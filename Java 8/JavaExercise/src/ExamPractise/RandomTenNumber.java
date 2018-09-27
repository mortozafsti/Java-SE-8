
package ExamPractise;

import java.util.Random;

public class RandomTenNumber {
    public static void main(String[] args) {
        Random rand = new Random(100);
        
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(90)+10;
            System.out.println(num+" ");
        }
        /*
        Random rand = new Random(100);
        Set<Integer> unique = new HashSet<>();
        
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(90)+10;
            unique.add(num);    
        }
        for(int i : unique){ 
            System.out.println(i+" ");
        }
        */
    }
}
