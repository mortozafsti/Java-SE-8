
package Exercise;

import java.util.Scanner;

public class PrimeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        int number = sc.nextInt();
        
        int m = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                m += 1;
            }
        }
        if (m == 2) {
            System.out.println(number+" is Prime");
        }else{ 
            System.out.println(number+" is not Prime");
        }
    }
}
