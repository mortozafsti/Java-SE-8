
package ChapterTen;

public class Palindom {
    public static void main(String[] args) {
      
        
    }
    
    public boolean isPalindom(String s){ 
        StringBuilder str = new StringBuilder(s);
        boolean status = false;
        String newstr = String.valueOf(str.reverse());
        if (newstr == s) {
            return true;
        }
        return status;
    }
}
