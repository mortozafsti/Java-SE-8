
package ChapterNineteen;

import java.util.ArrayList;
import java.util.List;

public class BasicGeneric {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Integer(1500000));
        list.add(new String ("Abc"));
        list.add(12);
        list.add("MAhabub");
       // list.forEach(System.out::println);//it is Lambda Expression
        for (Object object : list) {
            System.out.println(object);
        }
        
        
        List<Integer> lists = new ArrayList<>();
        lists.add(1000);
        
    }
}
