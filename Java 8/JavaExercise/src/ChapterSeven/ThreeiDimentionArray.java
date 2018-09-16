package ChapterSeven;

public class ThreeiDimentionArray {

    public static void main(String[] args) {

        //Single dimention Array
        int [][][] p = {
            {{2,3,5,7}, {7,8,9},{1,4,7,9}},{{2,3,5,7}, {7,8,9},{1,4,7,9},{2,9,6}},{{2,3,5,7}, {7,8,9},{1,4,7,9}}
        }; //Length 8 index 7
        System.out.println("Length of p: " + p.length);
        //System.out.println("p[2][2]: " + p[0][6]);

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
