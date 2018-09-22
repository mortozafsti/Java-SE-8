package ChapterEleven.newpackage1.ex3;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<String> citylist = new ArrayList<>();

        citylist.add("London");
        citylist.add("Denvor");
        citylist.add("Paris");
        citylist.add("Miami");
        citylist.add("Seoul");
        citylist.add("Tokeyo");
        citylist.add(2, "Xiam");

        System.out.println(citylist);
        System.out.println("List Size: " + citylist.size());
        System.out.println("is Miami in the List: : " + citylist.contains("Miami"));
        System.out.println("The location of the Denvor in the list : " + citylist.indexOf("Denvor"));
        System.out.println("is the List Empty : " + citylist.isEmpty());
        System.out.println("Remove  : " + citylist.remove("Xiam"));
        System.out.println(citylist.toString());

        for (int i = citylist.size() - 1; i >= 0; i--) {
            System.out.println(citylist.get(i) + " ");
            System.out.println();
        }
    }
}
