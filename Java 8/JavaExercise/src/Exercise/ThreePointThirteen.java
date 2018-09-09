
package Exercise;

import java.util.Scanner;

/**
 *
 * @author Cf-37
 */
public class ThreePointThirteen {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        
        int age = sc.nextInt();
        
        if(age < 16){ 
            System.out.println("Can not get a driver licence");
        }else{ 
            System.out.println("Can get a driver licence");
        }
    }
}
