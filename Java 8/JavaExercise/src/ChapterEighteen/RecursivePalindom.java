
package ChapterEighteen;

public class RecursivePalindom {
    public static void main(String[] args) {
        System.out.println("Is moon a Palindom "+isPalindom("moon"));
        System.out.println("Is moon a Palindom "+isPalindom("noon"));
        
    }
    public static boolean isPalindom(String s){ 
        return isPalindom(s, 0, s.length() -1);
    }
    public static boolean isPalindom(String s, int low, int high){ 
        if (high <= low) {
            return true;
        }else if(s.charAt(low) != s.charAt(high)){ 
            return false;
        }else{ 
            return isPalindom(s, low + 1, high - 1);
        }
    }
}
