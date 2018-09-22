package ChapterEleven.newpackage1.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class DistinctNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer Number: ");

        int value;
        do {
            value = sc.nextInt();
            if (!list.contains(value) && value != 0) {
                list.add(value);
            }
        } while (value != 0);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
