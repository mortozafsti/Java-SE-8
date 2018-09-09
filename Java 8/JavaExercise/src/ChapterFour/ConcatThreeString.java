
package ChapterFour;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ConcatThreeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 String: ");
        
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();
        String s4 = s1 + s2 + s3;
        System.out.println("Three String Are: "+s4);
    }
}
