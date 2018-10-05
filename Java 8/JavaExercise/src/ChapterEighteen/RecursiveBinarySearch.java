package ChapterEighteen;

import ChapterSeven.*;

public class RecursiveBinarySearch {

    public static void main(String[] args) {

        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(list, 11));
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        return binarySearch(list, key, low, high);
    }

    private static int binarySearch(int[] list, int key, int low, int high) {
        if (low > high) {
            return -low - 1;
        }
        int mid = (low + high) / 2;
        if (key < list[mid]) {
            return binarySearch(list, key, low, mid - 1);
        } else if (key == list[mid]) {
            return mid;
        } else {
            return binarySearch(list, key, mid + 1, high);
        }

    }
}
