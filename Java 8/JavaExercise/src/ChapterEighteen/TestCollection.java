
package ChapterEighteen;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        ArrayList<String> collection1 = new ArrayList<>();
        collection1.add("New York");
        collection1.add("Atlanta");
        collection1.add("Dallas");
        collection1.add("Madison");
        System.out.println("A List Of Cities in Collection: "+collection1);
        System.out.println("Is Dallas in Collections: "+collection1.contains("Dallas"));
        
        collection1.remove("Dallas");
        System.out.println(""+collection1.size()+" Cities are Collection Now");
        
        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Seattle");
        collection2.add("Portland");
        collection2.add("Los Angels");
        collection2.add("Atlanta");
        
        System.out.println("A List Of Cities in Collection 2: ");
        System.out.println(collection2);
        
        ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
        c1.addAll(collection2);
        System.out.println("Cities are Collection in Collection1 or Collection2");
        System.out.println(c1);
        
        c1 =(ArrayList<String>)(collection1.clone());
        c1.retainAll(collection2);
        System.out.println("Cities are Collection in Collection1 And Collection2");
        System.out.println(c1);
        
        c1 =(ArrayList<String>)(collection1.clone());
        c1.removeAll(collection2);
        System.out.println("Cities are Collection but not in 2");
        System.out.println(c1);
    }
}
