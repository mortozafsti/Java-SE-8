
package ChapterEighteen;

import java.util.Scanner;

public class ExampleOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int dd = sc.nextInt();
        System.out.println("There are Moves: ");
        moveDisk(dd, 'A', 'B', 'C');
    }
    public static void moveDisk(int n, char fromTower, char toTower, char auxTower){ 
        if (n == 1) {
            System.out.println("Moved Disk "+n+" from "+fromTower+" to "+toTower);
        }else{ 
            moveDisk(n-1, fromTower, auxTower, toTower);
            System.out.println("Moved Disk "+n+" from "+fromTower+" to "+toTower);
            moveDisk(n-1, auxTower, toTower, fromTower);
        }
    }
}
