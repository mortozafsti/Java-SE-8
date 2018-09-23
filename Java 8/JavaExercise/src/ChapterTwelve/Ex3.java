
package ChapterTwelve;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("111111111111111");
        try {
            System.out.println(10/0);
        } catch (Exception e) {
            System.out.println("You can not Divide by Zero");
        }
        
        System.out.println("22222222222222222");
        try {
            System.out.println(Integer.parseInt("TEN"));
        } catch (Exception e) {
            System.out.println("You can not Parede");
        }
        System.out.println("33333333333333333333333");
    }
}
