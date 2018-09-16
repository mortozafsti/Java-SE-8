package ChapterSeven;



public class TestPassArray {

    public static void main(String[] args) {
        int[] a = {1,2};
        System.out.println("Array is: "+a[0]+", "+a[1]);
        
        swapOne(a[0],a[1]);
        System.out.println("Array is One: "+a[0]+", "+a[1]);
        
        swapTwo(a);
        System.out.println("Array is Two: "+a[0]+", "+a[1]);
    }

    public static void swapOne(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

    public static void swapTwo(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }
}
