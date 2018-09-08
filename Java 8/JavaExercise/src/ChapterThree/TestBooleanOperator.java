
package ChapterThree;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class TestBooleanOperator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an Integer: ");
        int number = input.nextInt();
        
        if(number % 2 == 0 && number % 3 == 0){ 
            System.out.println(number+" is divisable by 2 and 3.");
        }else{ 
            System.out.println(" No ");
        }
        if(number % 2 == 0 || number % 3 == 0){ 
            System.out.println(number+" is divisable by 2 and 3.");
        }else{ 
            System.out.println(" No ");
        }
        if(number % 2 == 0 ^ number % 3 == 0){ 
            System.out.println(number+" is divisable by 2 and 3.");
        }else{ 
            System.out.println(" No ");
        }
    }
}
