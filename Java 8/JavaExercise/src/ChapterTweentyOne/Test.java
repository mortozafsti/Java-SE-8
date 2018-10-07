package ChapterTweentyOne;

import java.util.HashSet;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("London");
        set.add("Paris");
        set.add("New Work");
        set.add("San Franchisco");
        set.add("Beijing");
        set.add("USA");

        System.out.println(set);
        for (String s : set) {
            System.out.print(s.toUpperCase() + " ");
        }

    }
}
