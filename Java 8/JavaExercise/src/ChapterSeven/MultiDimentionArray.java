package ChapterSeven;

public class MultiDimentionArray {

    public static void main(String[] args) {

        //Single dimention Array
        int p[][] = {{2,3,5,7}, {7,8,9},{1,4,7,9}}; //Length 8 index 7
        System.out.println("Length of p: " + p.length);
        System.out.println("p[1][1]: " + p[1][1]);
        System.out.println("p[2][0]: " + p[2][0]);

        for (int[] is : p) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("..........\n'''''''''''''''''''''''");
        int q[][] = {{2,3,5,7}, {7,8,9},{1,4,7,9},{2,9,6}}; //Length 8 index 7
        System.out.println("Length: "+q.length);
        System.out.println("p[3][1]: "+q[3][1]);
        
        for (int[] is : q) {
            for (int i : is) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
