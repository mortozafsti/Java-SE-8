
package ChapterFour;

/**
 *
 * @author User
 */
public class EqualityCheckString {
    public static void main(String[] args) {
        String str = "BangladesH";
        String str1 = "BanglAdesH";
        
               //////////////Equality Check
        if(str == str1){ 
            System.out.println("True");
        }else{ 
            System.out.println("False");
        }
        //Way 2
        if(str.equalsIgnoreCase(str1)){ 
            System.out.println("True");
        }else{ 
            System.out.println("False");
        }
        
        
    }
}
