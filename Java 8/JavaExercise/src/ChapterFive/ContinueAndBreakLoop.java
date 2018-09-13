
package ChapterFive;

/**
 *
 * @author User
 */
public class ContinueAndBreakLoop {
    public static void main(String[] args) {
        System.out.println("This is Continue Loop");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                if (i == 5) {
                    continue;
                }
                System.out.println(""+i);
            }
        }
        
        System.out.println("This is Break Loop");
        ////////Break////////////
        for (int i = 1; i <=10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(""+i);
        }
    }
}
