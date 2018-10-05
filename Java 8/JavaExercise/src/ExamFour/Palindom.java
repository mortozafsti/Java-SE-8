
package ExamFour;

public class Palindom {
    public static void main(String[] args) {
        String[] arr = { "mom","wow","bye","madam","hai"};
        System.out.println(isPalindom(arr[2]));
        System.out.println(isPalindomCunt(arr));
        
    }
    public static boolean isPalindom(String n){
        
        StringBuilder str = new StringBuilder( n);
        boolean status = false;
        String newstr = String.valueOf(str.reverse());
        if (newstr.equalsIgnoreCase(n)) {
            return true;
        }
        return status;
    }
    public static int isPalindomCunt(String[] s){
        
        int counter = 0;
        for (int i = 0; i <s.length; i++) {
            if (isPalindom(s[i])) {
                counter++;
            }
        }
        return counter;
    }
}
