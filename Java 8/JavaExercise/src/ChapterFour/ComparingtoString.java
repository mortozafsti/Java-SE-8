
package ChapterFour;

/**
 *
 * @author User
 */
public class ComparingtoString {
    public static void main(String[] args) {
        String s1 = "abd";
        String s2 = "abg";
        
               //////////////Equality Check
        if(s1.compareTo(s2) < 0){ 
            System.out.println("Less than Zero");
        }else if(s1.compareTo(s2) > 0){ 
            System.out.println("Gratter than Zero");
        }else if(s1.compareTo(s2) == 0){ 
            System.out.println("Equal to Zero");
        }
        //Way 2
        
        
        
    }
}
