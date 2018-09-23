package ChapterTwelve;

public class ExceptionEx {

    static int x = 10;
    static int y = 0;
    static String str = "Ten";

    public static void main(String[] args) {
        
        try {
            System.out.println(Integer.parseInt(str));
            System.out.println(x / y);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("hellllllllloooooooooo");
    }

}
