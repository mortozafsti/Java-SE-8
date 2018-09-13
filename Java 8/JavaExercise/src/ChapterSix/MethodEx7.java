package ChapterSix;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MethodEx7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Valoe of Numx: ");
        int x = sc.nextInt();

        System.out.println("Enter Valoe of Numy: ");
        int y = sc.nextInt();

        MethodEx7 n = new MethodEx7();
        int re = n.makeSum(x, y);
        System.out.println("Result: " + re);
    }

    public int makeSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
