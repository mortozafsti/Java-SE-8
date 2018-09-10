
package ChapterFour;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class OrderTwoCity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First City: ");
        String city1 = sc.nextLine();
        
        System.out.println("Enter Second City: ");
        String city2 = sc.nextLine();
        
        if(city1.compareTo(city2) < 0){ 
            System.out.println("The citys in a alphabetically Order: "+city1 +" "+ city2);
        }else{ 
            System.out.println("The citys in a alphabetically Order: "+city1 +" "+ city2);
        }
        
    }
}
