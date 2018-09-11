/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise;

import java.util.Scanner;

/**
 *
 * @author Cf-37
 */
public class AdditionalQuiz {
    public static void main(String[] args) {
        
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 7 % 10);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is "+number1+" + "+number2+" ? ");
        
        int answer = input.nextInt();
        
        System.out.println(number1+" + "+number2+" = "+answer + (number1 + number2 == answer));
    }
}
