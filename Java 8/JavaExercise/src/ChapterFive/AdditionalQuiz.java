package ChapterFive;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class AdditionalQuiz {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, max;
        System.out.println("En ter Value: ");
        number = input.nextInt();
        max = number;
        while (number != 0) {
            number = input.nextInt();
            if (number > max) {
                max = number;
            }
        }
        System.out.println("max is " + max);
        System.out.println("number " + number);

    }
}
