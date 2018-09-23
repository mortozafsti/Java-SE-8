package Exercise;

public class A {

    public int calculate(int a, int b) {
        return 1;
    }
}

class B extends A {

    @Override
    public int calculate(int a, int b) {
        return 2;
    }
}
class Output{ 
    public static void main(String[] args) {
        A b = new B();
        System.out.println("B is: "+b.calculate(4, 1));
    }
}
