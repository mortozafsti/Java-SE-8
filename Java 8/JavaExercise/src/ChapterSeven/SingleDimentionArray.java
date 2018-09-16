package ChapterSeven;

public class SingleDimentionArray {

    public static void main(String[] args) {

        //Single dimention Array
        int p[] = {10, 25, 35, 23, 14, 32, 44, 91}; //Length 8 index 7
        System.out.println("p[5]: " + p[5]);
        // p = new int[9];
        for (int j : p) {
            System.out.print(j + " ");
        }
        System.out.println();
        //Single dimention Array
        int q[] = {40, 55, 58, 61, 53, 73};
        // index    0   1  2  3  4  5

        for (int i : q) {
            System.out.print(i + " ");
        }

    }
}
