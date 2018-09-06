
package ChapterThree;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        
        int number = sc.nextInt();
        int i;
        
        
        
        for(i = 2; i<=number; i++){ 
            if(number % i == 0){ 
                System.out.println("This is Prime");
            }else{ 
                System.out.println("This is not Prime");
            }
        }
    }
}
