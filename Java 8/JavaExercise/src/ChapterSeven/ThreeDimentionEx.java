package ChapterSeven;

public class ThreeDimentionEx {

    public static void main(String[] args) {

        int p[][][] = {
            {{1, 2, 3, 4}, {5, 6, 7}, {8, 9, 1, 2}},
            {{1, 2, 4}, {5, 6, 7}, {8, 9}},
            {{1, 2}, {5, 6, 7}, {8, 9, 1, 2}},
            {{1, 2, 3}, {5, 6, 7}, {1, 2}},};
        System.out.println("Length: " + p.length);
        System.out.println("p[2][3]: "+p[2][1]);
        
        for (int[][] ises : p) {
            for (int[] e : ises) {
                for (int i : e) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
