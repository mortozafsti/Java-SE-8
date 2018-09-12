
package ChapterFive;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SubtractionQuizLoop {
    public static void main(String[] args) {
        
        final int NUMBER_OF_QUESTION = 5;
        int CorrectCount = 0;
        int Count = 0;
        
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner sc = new Scanner(System.in);
        
        while (Count < NUMBER_OF_QUESTION) {            
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            
            if(number1 < number2){ 
                int temp = number1;
                number1 = number2;
                number2 =temp;
            }
            System.out.println("What is "+number1+" - "+number2+" ? ");
            int answer = sc.nextInt();
            
            if (number1 - number2 == answer) {
                System.out.println("You are Correct");
                CorrectCount++;
            }
        }
    }
}


