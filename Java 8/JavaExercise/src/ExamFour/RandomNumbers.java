
package ExamFour;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rd = new Random(100);
        Set<Integer> unique = new HashSet<Integer>();
        
        for (int i = 0; i < 10; i++) {
            int dd = rd.nextInt(10)+90;
            unique.add(dd);
            
        }
        for (Integer integer : unique) {
            System.out.println(integer+" ");
        }
    }
}
