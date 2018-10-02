
package ExamFour;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N Numbers");
        int dd = sc.nextInt();
        System.out.println("Enter the Number: ");
        
        Integer arr[] = new Integer[dd];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Min: "+arr[0]+" Max: "+arr[arr.length-1]);
    }
}
