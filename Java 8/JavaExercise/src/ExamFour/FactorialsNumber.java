
package ExamFour;

import java.util.Scanner;

public class FactorialsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int dd = sc.nextInt();
        factorialss(dd);
    }
    static void factorialss(int n){ 
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
