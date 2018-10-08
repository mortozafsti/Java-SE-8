package ChapterTweentyThree;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {2, 9, 5, 4, 8, 1, 6};
        //int[] arr = {3, 7, 2, 1, 5};
        for (int i : bubbleSort(arr)) {
            System.out.print(i+" ");
        }
    }

    public static int[] bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;

                    needNextPass = true;
                }
            }
        }
        return list;
    }
}
