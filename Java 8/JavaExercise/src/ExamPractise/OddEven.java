package ExamPractise;

import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int dd = sc.nextInt();
        isoddEven(dd);

    }

    static void isoddEven(int num) {

        if (num == 0) {
            System.out.println("Num is Zero");
        } else {
            if (num % 2 == 0) {
                System.out.println(num + " is Even Number");
            } else {
                System.out.println(num + " is Odd Number");
            }
        }

    }
}
