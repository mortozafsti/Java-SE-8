package Exercise;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Integer: ");
        int i = scan.nextInt();

        System.out.println("Enter the Double: ");
        double d = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the String: ");
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    /*
        public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN.
         * Print output to STDOUT.
         * Your class should be named Solution.
         
        int num = 0;
        double dou = 0.0;
        String s = null;
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            num = in.nextInt();
        }

        Scanner d = new Scanner(System.in);
        if (d.hasNextDouble()) {
            dou = d.nextDouble();
        }

        Scanner str = new Scanner(System.in);
        if (str.hasNextLine()) {
            s = str.nextLine();
        }

        System.out.println("String:" + s);
        System.out.println("Double:" + dou);
        System.out.println("Int:" + num);
    }
     */

}
