
package Exercise;

import java.util.Scanner;

/**
 *
 * @author Cf-37
 */
public class SubtractionQuiz {
    public static void main(String[] args) {
        
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        
        if(number1 < number2){ 
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println("What is "+number1+" - "+number2+" ? ");
        
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        
        if(number1 - number2 == answer){ 
            System.out.println("You Answer is Correct");
        }else{ 
            System.out.println("You Answer is Wrong");
            System.out.println("Your Aswer Should be: "+(number1-number2));
        }
    }
}
