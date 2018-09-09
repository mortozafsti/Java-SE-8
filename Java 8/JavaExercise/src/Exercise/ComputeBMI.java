package Exercise;

import java.util.Scanner;

/**
 *
 * @author Cf-37
 */
public class ComputeBMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Weight in pound: ");
        double weight = sc.nextDouble();

        System.out.println("Enter height in Inc: ");
        double height = sc.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double MITTERS_PER_INCH = 0.0254;

        double weights = weight * KILOGRAMS_PER_POUND;
        double heights = height * MITTERS_PER_INCH;
        
        double bmi = weights / (heights * heights);
        
        System.out.println("BMI is: "+bmi);
        if(bmi < 18.5){ 
            System.out.println("UnderWeight");
        }else if(bmi < 25){ 
            System.out.println("Normal"); 
        }else if(bmi < 30){ 
            System.out.println("OverWeight"); 
        }else{ 
            System.out.println("Obese");
        }

    }
}
