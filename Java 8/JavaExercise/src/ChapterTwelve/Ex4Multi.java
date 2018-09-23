package ChapterTwelve;

public class Ex4Multi {

    public static void main(String[] args) {
        System.out.println("111111111111111");
        try {
            System.out.println(10 / 0);
            System.out.println(Integer.parseInt("Ten"));

        } catch (ArithmeticException ae) {
            System.out.println("You can not Divide by Zero");
        } catch (NumberFormatException e) {
            System.out.println("You can not Parse the int TEN Five ETC");
        }

        System.out.println("22222222222222222");

        System.out.println("33333333333333333333333");
    }
}
