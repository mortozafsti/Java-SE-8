package ChapterNineteen;

public class ManualSort {

    public static void main(String[] args) {

        int[] arr = {2, 1, 4, 6, 3};
        int[] sortArr = new int[arr.length];

       
        for (int i = 0; i < arr.length; i++) {
             int tempMin = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (tempMin > arr[j]) {
                    tempMin = arr[j];
                }
                sortArr[i] = tempMin;
            }
            //System.out.println(tempMin);
        }
        for (int i : sortArr) {
            System.out.println(i+" ");
        }
    }
}
