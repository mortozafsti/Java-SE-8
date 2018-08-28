/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

public class JustSumofXandY {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Value of X: ");
        double x = sc.nextDouble();
        
        System.out.println("Enter The Value of Y: ");
        double Y = sc.nextDouble();
        
        double sum = x+Y;
        
        System.out.println("The Sum Of "+x+" and "+Y+" is "+sum);
    }
}
