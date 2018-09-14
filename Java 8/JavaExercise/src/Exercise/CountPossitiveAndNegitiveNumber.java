
package Exercise;

import java.util.Scanner;

/**
 *
 * @author Cf-37
 */
public class CountPossitiveAndNegitiveNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        float possitiveSum = 0;
        float nagetiveSum = 0;
        float number;
        float pssitiveCounter= 0;
        float nagetiveCounter = 0;
        float total =  0;
        
        System.out.print("Enter the PossAndNgetive number: ");
        number = sc.nextFloat();
        
        while (number != 0) {            
            if (number > 0) {
                possitiveSum +=number;
                pssitiveCounter++;
            }else{ 
                nagetiveSum +=number;
                nagetiveCounter++;
            }
            
            number = sc.nextFloat();
            total = (possitiveSum-nagetiveSum);
        }
        System.out.print("Positive Sum: "+possitiveSum+"\nNagetive Sum: "+nagetiveSum+"\nPositive Avg: "+possitiveSum / pssitiveCounter+"\nNagetive Avg: "+nagetiveSum / nagetiveCounter);
        System.out.println("\n pssitiveCounter: "+pssitiveCounter);
        System.out.println("\n nagetiveCounter: "+nagetiveCounter);
        System.out.println("\n Sum: "+total);
        sc.close();
    }
}
