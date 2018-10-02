
package ExamFour;

public class Palindom {
    public static void main(String[] args) {
        String[] arr = { "mom","wow","bye","madam","hai"};
        System.out.println(isPalindom(arr[2]));
        
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
}
