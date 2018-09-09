package Exercise;

import java.util.Scanner;

/**
 *
 * @author Cf-37
 */
public class IfElseStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("This is Even Number");
        } else {
            System.out.println("This is Odd Number");
        }
    }
}
