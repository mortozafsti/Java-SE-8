
package ExamSix;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int dd = sc.nextInt();
        Factorial(dd);
        
    }
    static void Factorial(int n){ 
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factrial of "+n+" is "+fact);
    }
}
