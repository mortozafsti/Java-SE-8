
package ExamSix;

import java.math.BigInteger;
import java.util.Scanner;


public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int dd = sc.nextInt();
        isPrime(dd);
        
        
    }
    static void isPrime(int n){ 
        if (BigInteger.valueOf(n).isProbablePrime(n)) {
            System.out.println(n+" is Prime");
        }else{ 
            System.out.println(n+" is not Prime");
        }
    }
}
