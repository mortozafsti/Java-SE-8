
package Exercise;

/**
 *
 * @author Cf-37
 */
public class FivePointTweentyA {
    public static void main(String[] args) {
         System.out.println("         Multiplication table");
         System.out.print("\n-----------------------------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%4d",i * j);
            }
            System.out.println();
        }
    }
}
