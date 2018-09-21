
package ChapterTen;

import java.util.ArrayList;
import java.util.List;

public class BoxUnbox {
    public static void main(String[] args) {
        Integer i = new Integer(10); // It is Boxing
        
        int j = i;// It is UnBoxing
        
        
        System.out.println(""+i);
        System.out.println(""+j);
        
        Integer p = new Integer(10); // It is Boxed
        int q =p; //Auto Unboxing
        int r =p.intValue(); //Unboxing
        
        
        
        /////////////////////Boxing
        
        int x = 10;
        Integer y = x; //Auto Boxing
        
        List<Integer> list = new ArrayList<Integer>();
        for (int l = 0; l < 10; l++) {
            list.add(i);
            System.out.println(list);
        }
        System.out.println(p instanceof Integer);
        System.out.println(p+" = "+q);
    }
}
