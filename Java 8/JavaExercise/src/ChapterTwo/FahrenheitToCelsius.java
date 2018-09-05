/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        
        System.out.println("Enter the degree in farenhit: ");
        double farehn = input.nextDouble();
        
        double celsius = (5.0/9) * (farehn-32);
        
        System.out.println("Farenhit: "+farehn+" is "+celsius+" celsius");
       
    }
}
