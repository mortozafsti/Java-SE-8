package ChapterTweentyThree;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 4, 8, 1, 6};
        //int[] arr = {3, 7, 2, 1, 5};
        for (int i : insertionSorts(arr)) {
            System.out.print(i + " ");
        }
    }
    public static int[] insertionSorts(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
            //System.out.println(list[k]);
        }
        return list;
    }
}
