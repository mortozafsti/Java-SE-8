package ChapterFour;

/**
 *
 * @author User
 */
public class AllStringMethod {

    public static void main(String[] args) {

        String str = "Dhakah";

        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("a", 3));
        System.out.println(str.indexOf("z", 3));
        System.out.println(str.lastIndexOf("h"));
        
        /////////////////Convertion
        
        String ss= "10";
        int i = Integer.valueOf(ss);
        
        System.out.println("I: "+i);
        double salary= 50000.0;
        String sal = String.valueOf(salary);
        long salLong = Long.valueOf(ss);
        boolean bool = true;
        String boo=String.valueOf(bool);
        char ch='A';
        String st=String.valueOf(ch);

    }
}
