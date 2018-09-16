package ChapterSeven;

import java.util.Scanner;

public class AnalyzeNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Item: ");
        int n = sc.nextInt();

        double[] numbers = new double[n];
        double sum = 0;

        System.out.println("Enter the Number: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }
        double average = sum /  n;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > average) {
                //count +=count;
                count++;
            }
        }
        System.out.println("Average is: " + average);
        System.out.println("The number of element above the average is: " + count);
    }
}
