package ChapterSeven;

import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        int x[] = {8, 9, 4, 1, 6, 7};

        //Sort this Array
        Arrays.sort(x, 2, 4);

        //Print this Array call by display Method thats method stay into another class
        ArrayAsMethodAfgument.displayArray(x);
        for (int i : x) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
