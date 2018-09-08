
package ChapterThree;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class CheckPoint {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        int x = sc.nextInt();
        
        if(x > 0 && x < 0){ 
            System.out.println("True");
        }else{ 
            System.out.println("False");
        }
        if(x > 0 || x < 0){ 
            System.out.println("True");
        }else{ 
            System.out.println("False");
        }
        if(x != 0 || x == 0){ 
            System.out.println("True");
        }else{ 
            System.out.println("False");
        }
    }
}
