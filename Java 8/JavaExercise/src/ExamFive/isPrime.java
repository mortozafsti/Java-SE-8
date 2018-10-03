/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamFive;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Cf-37
 */
public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int dd = sc.nextInt();
        isPrime(dd);
        
    }
    static void isPrime(int num){ 
        if (BigInteger.valueOf(num).isProbablePrime(1)) {
            System.out.println(num+" is Prime");
        }else{ 
            System.out.println(num+" is Not Prime");
        }
    }
    
}
