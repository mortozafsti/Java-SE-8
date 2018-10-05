
package ExamSix;

public class Palindon {
    public static void main(String[] args) {
        String[] palin = {"mon","wow","madam","bye"};
        System.out.println(isPalindom(palin[0]));
        
    }
    public static boolean isPalindom(String n){ 
        StringBuilder str  = new StringBuilder(n);
        boolean status = false;
        String newstr = String.valueOf(str.reverse());
        if (newstr.equalsIgnoreCase(n)) {
            return true;
        }
        return status;
    }
}
