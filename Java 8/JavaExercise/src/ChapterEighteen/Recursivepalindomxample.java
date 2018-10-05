
package ChapterEighteen;

public class Recursivepalindomxample {
    public static void main(String[] args) {
        System.out.println(ispalinDom("abdxcxdba"));
    }
    public static boolean ispalinDom(String s){ 
        if (s.length() <= 1) {
            return true;
        }else if(s.charAt(0) != s.charAt(s.length() - 1)){ 
            return false;
        }else{ 
            return ispalinDom(s.substring(1,s.length() -1));
        }
    }
}
