package ChapterFive;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class GussNumberOneTime {

    public static void main(String[] args) {
        int number = (int) (Math.random() * 101);

        Scanner sc = new Scanner(System.in);
        System.out.println("Guss a Magic Number Between 0 and 100");

        System.out.println("Enter Your Guss Number: ");
        int answer = sc.nextInt();

        if (answer == number) {
            System.out.println("Yes the Number is " + number);
        } else if (answer > number) {
            System.out.println("Yes the Number is High ");
        } else {
            System.out.println("Yes the Number is High ");
        }

       

    }
}
