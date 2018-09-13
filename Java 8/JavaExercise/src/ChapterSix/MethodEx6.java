package ChapterSix;

/**
 *
 * @author User
 */
public class MethodEx6 {

    int x = 10;
    int y = 5;

    public static void main(String[] args) {
        MethodEx6 n = new MethodEx6();
        int re = n.makeSum(n.x, n.y);
        System.out.println("Result: " + re);
    }

    public int makeSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
