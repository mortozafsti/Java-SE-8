package ChapterTweentyThree;



public class QuickSort {

    public static void main(String[] args) {
       int[] list = {2,3,2,5,6,1,-2,3,14,12};
        quickSortp(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
    }

    public static void quickSortp(int[] list) {
        quickSortp(list, 0, list.length - 1);
    }

    public static void quickSortp(int[] list, int fast, int last) {
        if (last > fast) {
            int pivotIndex = partition(list, fast, last);
            quickSortp(list, fast, pivotIndex - 1);
            quickSortp(list, pivotIndex + 1,last);
        }
    }

    public static int partition(int[] list, int fast, int last) {
        int pivot = list[fast];
        int low = fast + 1;
        int high = last;

        while (high > low) {
            while (low <= high && list[low] <= pivot) {
                low++;
            }
            while (low <= high && list[high] > pivot) {
                low--;
            }
            if (high > low) {
                int temp = list[high];
                list[high] = list[low];
                list[low] = temp;
            }
        }
        while (high > fast && list[high] >= pivot) {
            high--;
        }
        if (pivot > list[high]) {
            list[fast] = list[high];
            list[high] = pivot;
            return high;
        } else {
            return fast;
        }
    }

}
