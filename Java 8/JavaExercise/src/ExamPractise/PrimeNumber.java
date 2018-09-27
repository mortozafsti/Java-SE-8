
package ExamPractise;

import java.math.BigInteger;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int dd = sc.nextInt();
        isPrime(dd);
        
    }
    static void isPrime(int num){ 
        if (BigInteger.valueOf(num).isProbablePrime(1)) {
            System.out.println(num+" is Prime");
        }else{ 
             System.out.println(num+" not is Prime");
        }
    }
}
