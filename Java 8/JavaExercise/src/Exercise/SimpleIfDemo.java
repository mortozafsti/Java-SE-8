

package Exercise;

import java.util.Scanner;

/**
 *
 * @author Cf-37
 */
public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter An Integer: ");
        int answer = sc.nextInt();
        
        if(answer % 5 == 0) System.out.println("Hi Five");
        if(answer % 2 == 0) System.out.println("Hi Even");
    }
}
