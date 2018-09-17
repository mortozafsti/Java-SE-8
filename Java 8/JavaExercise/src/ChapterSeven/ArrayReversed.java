package ChapterSeven;

import java.util.Arrays;

public class ArrayReversed {

    public static void main(String[] args) {
        int[] x = {5, 8, 7, 1, 6, 10, 12, 84};
       // Arrays.sort(x);
       
        int newArray[] = new int[x.length];

        int j = 0;
        for (int i = x.length - 1; i >= 0; i--) {
            newArray[j] = x[i];
            j++;
        }
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }
}

