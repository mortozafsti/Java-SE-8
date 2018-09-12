package Exercise;

import java.util.Scanner;

/**
 *
 * @author Cf-37
 */
public class FaboncciNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the value: ");
        int a = scan.nextInt();
        
        System.out.print("Enter the value: ");
        int b = scan.nextInt();
        
        for (int i = 0; i < 5; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.print(" " + a);
        System.out.print(" " + b);
    }
}
