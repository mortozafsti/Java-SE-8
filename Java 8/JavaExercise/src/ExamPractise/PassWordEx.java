
package ExamPractise;

import java.util.Scanner;

public class PassWordEx {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the Character: ");
        
        String Pass = sc.nextLine();
        if (Pass.length() >= 7) {
            System.out.println("Valid");
        }else{ 
            System.out.println("Not Valid");
        }
    }
}
