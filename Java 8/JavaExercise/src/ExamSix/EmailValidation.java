
package ExamSix;

import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        
        String email = sc.nextLine();
        
        int a = email.indexOf("@");
        int b = email.indexOf(".");
        
        if (a > 0 && b < email.length()-2 && a < b -1) {
            System.out.println("Email is valid");
        }else{ 
            System.out.println("Email is  not valid");
        }
    }
}
