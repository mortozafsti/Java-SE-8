/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamFive;

import java.util.Scanner;

/**
 *
 * @author Cf-37
 */
public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Email");
        
        String email = sc.nextLine();
        
        int a = email.indexOf("@");
        int b = email.indexOf(".");
        
        if (a > 0 && b < email.length()-2 && a < b -1) {
            System.out.println("Email is valid");
        }else{ 
            System.out.println("Email is Not valid");
        }
    }
}
