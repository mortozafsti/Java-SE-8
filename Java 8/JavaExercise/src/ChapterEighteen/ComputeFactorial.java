package ChapterEighteen;

import java.util.Scanner;

public class ComputeFactorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int dd = sc.nextInt();

        System.out.println("Factorial of " + dd + " is " + factorial(dd));

    }

    public static long factorial(int n) {

        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
