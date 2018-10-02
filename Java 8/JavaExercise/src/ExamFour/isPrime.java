
package ExamFour;

import java.math.BigInteger;
import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int dd = sc.nextInt();
        isPrimes(dd);
    }
    static void isPrimes(int m){ 
        if (BigInteger.valueOf(m).isProbablePrime(1)) {
            System.out.println(m+" is Prime");
        }else{ 
            System.out.println(m+" is not Prime");
        }
    }
    
}
