
package Exercise;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialN {
    public static void main(String[] args) {
        
        getFactorial(5);
        getFactorials(5);
        
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int a = sc.nextInt();
        int i,fact=1;
        for (i = 1; i <=a; i++) {
            fact = fact*i;
        }
        System.out.println(""+fact);
        */
        
    }
    
    static void getFactorial(int n){ 
        BigInteger bi = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            bi = bi.multiply(BigInteger.valueOf(i));
        }
        System.out.println(bi);
    }
    static void getFactorials(int n){ 
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println(f);
    }
}
