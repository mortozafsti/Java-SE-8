
package ExamThree;

import java.util.Scanner;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email: ");
        String emails = sc.nextLine();
        
        int a = emails.indexOf("@");
        int b = emails.indexOf(".");
        if (a > 0 && b < emails.length()-2 && a < b -1) {
            System.out.println("Email is Valid");
        }else{ 
            System.out.println("Email is Not Valid");
        }
    }
}
