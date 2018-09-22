
package ChapterTen;

public class Palindom {
    public static void main(String[] args) {
      
        System.out.println(isPalindom("abc"));  
    }
    
    
    public static boolean isPalindom(String s){ 
        StringBuilder str = new StringBuilder(s);
        boolean status = false;
        String newstr = String.valueOf(str.reverse());
        if (newstr.equalsIgnoreCase(s)) {
            return true;
        }
        return status;
    }
}
