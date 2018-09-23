package ChapterTwelve;

public class Ex2 {

    public static void main(String[] args) {
        try {
            System.out.println(getDivision(10, 0));
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("hhhhhhhhhhh");
        }
        System.out.println("Hello ");
        System.out.println(getParseString("Ten"));
        
    }

    //bring chiti style, receiver will (pay) handle exception
    public static int getDivision(int x, int y) throws ArithmeticException {
        int rs = x / y;
        return rs;
    }

    //Q String value like "10","5","100","k" int e transfer korbo How?
    /*
    Explanation: input String and Output int
    Output hobe method er data type and input hobe method er parameter
     */
    public static int getParseString(String str) {
        int rs = 0;
        try {
            rs = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("You can not Pass String like Ten Five etc");
        }
        
        return rs;
    }
}
