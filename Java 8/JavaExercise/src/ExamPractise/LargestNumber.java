package ExamPractise;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the First Number: ");
        int d1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int d2 = sc.nextInt();
        System.out.println("Enter the Third Number: ");
        int d3 = sc.nextInt();
        
        isLargestNumber(d1, d2, d3);

    }

    static void isLargestNumber(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " is Largest Number");
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is Largest Number");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " is Largest Number");
        } else {
            System.out.println(n1+","+n2+","+n3 + " are Equal");
        }
    }
}
