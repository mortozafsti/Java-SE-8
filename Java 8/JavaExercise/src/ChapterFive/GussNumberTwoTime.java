package ChapterFive;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class GussNumberTwoTime {

    public static void main(String[] args) {
        int number = (int) (Math.random() * 101);

        Scanner sc = new Scanner(System.in);
        System.out.println("Guss a Magic Number Between 0 and 100");

        int answer = -1;
        int attempts = 0;

        while (answer != number) {

            System.out.println("Enter Your Guss Number: ");
            answer = sc.nextInt();

            if (answer == number) {
                System.out.println("Yes the Number is " + number);
            } else if (answer > number) {
                System.out.println("Yes the Number is High ");
            } else {
                System.out.println("Yes the Number is Low ");
            }
            attempts ++;
        }
        System.out.println("The attempts: "+attempts);
    }
}
