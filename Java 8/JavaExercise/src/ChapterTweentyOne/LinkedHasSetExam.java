package ChapterTweentyOne;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHasSetExam {

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet();
        set.add("London");
        set.add("Majaajj");
        set.add("Aaris");
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
