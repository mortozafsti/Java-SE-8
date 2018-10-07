package ChapterTweentyOne;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestMap {

    public static void main(String[] args) {
        Map<String, Integer> set = new HashMap();
        set.put("name", 30);
        set.put("age", 23);
        set.put("country", 50);

        System.out.println("Enter the HasMAp: ");
        System.out.println(set);

        Map<String, Integer> set1 = new TreeMap(set);
        System.out.println("Display Assending Order: ");
        System.out.println(set1);

        Map<String, Integer> set2 = new LinkedHashMap<>(16);
        set2.put("name", 30);
        set2.put("age", 23);
        set2.put("country", 50);
       
        System.out.println(set2.get("age"));

        //Map<String,Integer> ss = new HashMap<>();
    }
}
