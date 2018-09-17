package Exercise;

public class ArrayReturnFromMethod {

    public static void main(String[] args) {
        int[] x = {8,5,4,9,23};
        display(x);
        display(transferArray(x));
    }
    public static void display(int[] s){ 
        for (int i : s) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static int[] transferArray(int[] arr){ 
        int[] tar = new int[arr.length];
        System.arraycopy(arr, 0, tar, 0, arr.length);
        return tar;
    }
}
