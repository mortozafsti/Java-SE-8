
package Exercise;

/**
 *
 * @author Cf-37
 */
public class NestedLoopEx2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                if (j < i) {
                    System.out.printf("%3d",j);
                }else{ 
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
