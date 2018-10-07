package ChapterTweentyOne;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("London");
        set.add("Majaajj");
        set.add("Aaris");
        set.add("New Work");
        set.add("San Franchisco");
        set.add("Beijing");
        set.add("USA");

        System.out.println(set.first());
        System.out.println(set.last());
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        System.out.println(set.lower("l"));
        System.out.println(set.higher("N"));
        
        

    }
}
