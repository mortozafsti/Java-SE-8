package ChapterEighteen;

import java.util.Scanner;

public class Powers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int a = sc.nextInt();

        System.out.println("Enter the Power: ");
        int b = sc.nextInt();

        /*
        int a = 20;
        int b = 3;
        
         */
        System.out.println("Total Value: "+Math.pow(a, b));

    }
}
