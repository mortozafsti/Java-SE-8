package ChapterTen;

public class StringS {

    static String s2 = new String("Welcome To");
    static String s1 = new String("Welcome To");
    static String s3 = new String("Welcome To Java");
    public static void main(String[] args) {
        
        String s1 = "Welcome";
        s1 ="No";
        
        String s2 = new String("Welcome tpJava");
        s2 = "No";
        
        System.out.println(s2);
        System.out.println(s1);
        System.out.println(s1.compareTo(s2));
        //System.out.println(s3.replace("c", "k"));
        System.out.println(s3);
        System.out.println(s3.replace("co", "ka"));
    }

}
