
package Exercise;

import java.util.Scanner;

/**
 *
 * @author Cf-37
 */
public class OddAndEvenNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(number+" is Even");
        }else{ 
             System.out.println(number+" is Odd");
        }
    } 
}
