
package Exercise;

import java.util.Scanner;

/**
 *
 * @author Cf-37
 */
public class MaltiWayNestedif {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Score: ");
        int score = sc.nextInt();
        
        if(score >= 80 && score <= 100){ 
            System.out.println("A+");
        }else if(score >= 70 && score < 80){ 
            System.out.println("A");
        }else if(score >= 60 && score < 70){ 
            System.out.println("B");
        }else if(score >= 50 && score < 60){ 
            System.out.println("C");
        }else if(score >= 40 && score < 50){ 
            System.out.println("D");
        }else if(score > 100){ 
            System.out.println("Invalid Number");
        }else{ 
            System.out.println("F");
        }
    }
}
