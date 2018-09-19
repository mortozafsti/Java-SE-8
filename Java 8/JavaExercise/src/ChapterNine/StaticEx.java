package ChapterNine;

public class StaticEx {

    static int x = 10;
    static final int NUMBER_OF_STUDENT = 12; // It is Constant

    public static void main(String[] args) {
        x = 15;
        display();
        StaticEx.display();
        StaticEx se = new StaticEx();
        se.display2();

    }

    public static int display() {
        return 10;
    }

    public void display2() {
        System.out.println("Hi");
    }
}
