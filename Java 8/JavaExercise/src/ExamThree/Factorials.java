
package ExamThree;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int dd = sc.nextInt();
        int i,fact=1;
        for (i = 1; i <=dd; i++) {
            fact = fact*i;        
        }
         System.out.println("Factorial of "+dd+" is "+fact);
    }
}
