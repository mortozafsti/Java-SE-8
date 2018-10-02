package ExamThree;

import java.math.BigInteger;
import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int dd = sc.nextInt();
        isPrimes(dd);
    }

    static void isPrimes(int x) {
        if (BigInteger.valueOf(x).isProbablePrime(x)) {
            System.out.println(x + " is prime");
        } else {
            System.out.println(x + " is not prime");
        }
    }
}
