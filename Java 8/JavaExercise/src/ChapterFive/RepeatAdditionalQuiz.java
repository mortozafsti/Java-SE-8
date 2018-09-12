package ChapterFive;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class RepeatAdditionalQuiz {

    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        Scanner sc = new Scanner(System.in);

        System.out.println("What is " + number1 + " + " + number2 + " ? ");
        int answer = sc.nextInt();

        while (number1 + number2 != answer) {
            System.out.println("Wromg Answer. Try Again. What is " + number1 + " + " + number2 + " ? ");
            answer = sc.nextInt();
        }
        System.out.println("You got it");
    }
}
