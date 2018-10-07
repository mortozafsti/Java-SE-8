
package ChapterTweentyOne;

import java.util.HashSet;
import java.util.Set;

public class TestMethodsInCollection {
    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("London");
        set.add("Paris");
        set.add("New Work");
        set.add("San Franchisco");
        set.add("Beijing");
        set.add("USA");
        
        System.out.println(set);
        System.out.println(set.size());
        
        set.remove("London");
        
        System.out.println(set);
        System.out.println(set.size());
        
        Set<String> set2 = new HashSet();
        set2.add("London");
        set2.add("Shangai");
        set2.add("Paris");
        
        System.out.println(set2);
        System.out.println(set2.size()+" Elements in Set 2");
        
        System.out.println(set2.contains("Taipei"));
        set.addAll(set2);
        System.out.println(set);
        
        set.removeAll(set2);
        System.out.println(set+ " It is removeing");
        
        set.retainAll(set2);
        System.out.println(set);
    }
}
