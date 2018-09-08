
package ChapterThree;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the Year: ");
        int year = sc.nextInt();
        
        boolean  isLeapyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        System.out.println(year+" is leap year "+isLeapyear);
    }
}
