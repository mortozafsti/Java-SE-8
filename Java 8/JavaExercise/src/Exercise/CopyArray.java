package Exercise;

import java.util.Arrays;

public class CopyArray {

    public static void main(String[] args) {
        int[] sourceArray = {23, 44, 55, 66, 6, 7, 8, 9, 10, 11, 12, 14};
        int[] targetArray = new int[sourceArray.length];

        Arrays.sort(sourceArray);
        int j = 0;
        for (int i = sourceArray.length - 1; i >= 0; i--) {
            targetArray[j] = sourceArray[i];
            j++;
        }
        for (int i : targetArray) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < sourceArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        System.out.println();
        for (int i : targetArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
