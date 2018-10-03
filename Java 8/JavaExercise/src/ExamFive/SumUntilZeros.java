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
public class SumUntilZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Serial Number: ");
        
        
        int sum = 0;
        int n = 0;
        System.out.println("Enter the Number: ");
        do {            
            n = sc.nextInt();
            sum +=n;
        } while (n != 0);
        sum += n;
        System.out.println("Sum: "+sum);
    }
}
