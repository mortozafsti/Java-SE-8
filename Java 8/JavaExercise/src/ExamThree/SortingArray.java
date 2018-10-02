
package ExamThree;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] sortArray = {11,5,8,9,2,1,7,6,12};
        //Arrays.sort(sortArray);
        int newArray[] = new int[sortArray.length];
        int j = 0;
        for (int i = sortArray.length-1; i >= 0; i--) {
            newArray[j] = sortArray[i];
            j++;
        }
        
        for (int i : newArray) {
            System.out.print(i+" ");
        }
    }
}
