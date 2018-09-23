package Exercise;

import java.util.Scanner;

public class SumUntilZero {

    public static void main(String[] args) {

        //int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");

        int m = 0;
        for (int i = 0;; i++) {
            int a = sc.nextInt();
            if (a != 5) {
                m +=a;
            }else{ 
                System.out.println("The Sum Of: "+m);
            }
        }
        /*
        do {            
            System.out.println("Enter the Number: ");
            m =sc.nextInt();
            sum +=n;
        } while (!str == "-1");
        
        
         */
    }
}
