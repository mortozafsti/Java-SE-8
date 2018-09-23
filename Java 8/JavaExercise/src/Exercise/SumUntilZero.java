package Exercise;

import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");

        int m = 0;
        for (int i = 0;; i++) {
            int a = sc.nextInt();
            if (a > 0) {
                m = m + a;
            } else {
                System.out.println("" + m);
            }
        }
    }
}
