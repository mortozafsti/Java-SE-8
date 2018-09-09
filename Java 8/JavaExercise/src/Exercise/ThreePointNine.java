
package Exercise;

import java.util.Scanner;

/**
 *
 * @author Cf-37
 */
public class ThreePointNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Value of X: ");
        int x = sc.nextInt();
        
        System.out.println("Enter the Value of Y: ");
        int y = sc.nextInt();
        
        if(x > 2){ 
            if(y > 2){
                int z = x + y;
                System.out.println("Z is: "+z);
            }
        }else{ 
            System.out.println("X is: "+x);
        }
    }
}
