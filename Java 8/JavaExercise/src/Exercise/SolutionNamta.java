package Exercise;

import java.util.Scanner;

public class SolutionNamta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int N = scanner.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {

            System.out.println(N + " * " + i + " = " + i * N);

        }
    }
}
