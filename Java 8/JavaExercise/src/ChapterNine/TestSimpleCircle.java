package ChapterNine;

public class TestSimpleCircle {

    public static void main(String[] args) {
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The are of the circle of radious: " + circle1.radious + " is " + circle1.getArea());

        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The are of the circle of radious: " + circle2.radious + " is " + circle2.getArea());

        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The are of the circle of radious: " + circle3.radious + " is " + circle3.getArea());

        circle2.radious = 100;
        System.out.println("The are of the circle of radious: " + circle2.radious + " is " + circle2.getArea());
    }
}

class SimpleCircle {

    double radious;

    public SimpleCircle() {
        radious = 1;
    }

    public SimpleCircle(double newRadious) {
        radious = newRadious;
    }

    double getArea() {
        return radious * radious * Math.PI;
    }

    double getPerimeter() {
        return 2 * radious * radious * Math.PI;
    }

    void setRadious(double newRadious) {
        radious = newRadious;
    }

}
