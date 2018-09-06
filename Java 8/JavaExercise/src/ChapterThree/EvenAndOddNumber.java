
package ChapterThree;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class EvenAndOddNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number: ");
        
        int number = sc.nextInt();
        
        if(number % 2 == 0){ 
            System.out.println("This is Even number");
        }else{ 
            System.out.println("This is Odd number");
        }
    }
}
