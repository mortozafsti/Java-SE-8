package ChapterEighteen;

import java.util.Scanner;

public class FactorialExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the factorial Number: ");
        int n = sc.nextInt();
        //facrt(n);
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    /*static void  facrt(int n){ 
       int fact = 1;
       for (int i = 1; i <=n; i++) {
           fact = fact * i;
       }
       System.out.println(fact);
   }*/
}
