package ChapterSix;

/**
 *
 * @author User
 */
public class MethodEx4 {

    int x = 10;
    static int y = 200;

    public static void main(String[] args) {
        MethodEx4 m = new MethodEx4();
        m.x = 20;

        y = 500;
        y = 505;

        System.out.println("X: " + m.x + " Y: " + y);
    }
}
