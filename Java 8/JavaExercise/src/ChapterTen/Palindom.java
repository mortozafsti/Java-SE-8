
package ChapterTen;

public class Palindom {

    public static void main(String[] args) {

        //System.out.println(isPalindom("madam"));
        
        String[] srrs = {"mom","abc","madam","wow","mim","eye","bye"};
        System.out.println(countPaliandom(srrs));
        
    }

    public static boolean isPalindom(String s) {
        StringBuilder str = new StringBuilder(s);
        boolean status = false;
        String newstr = String.valueOf(str.reverse());
        if (newstr.equalsIgnoreCase(s)) {
            return true;
        }
        return status;
    }
    
    public static int countPaliandom(String[] s){ 
        int counter = 0;
        for (int i = 0; i < s.length; i++) {
            if (isPalindom(s[i])) {
                counter++;
            }
        }
        return counter;
    }
}
