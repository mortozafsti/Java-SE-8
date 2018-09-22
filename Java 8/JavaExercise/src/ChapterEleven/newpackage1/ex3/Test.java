
package ChapterEleven.newpackage1.ex3;

public class Test {
    public static void main(String[] args) {
        
        A a = new A();
        B b1 = new B();
        A b2 = new B();
        
        //Now Call Method/////////
        
        a.sayHello();
        b1.sayHello();
        b1.sayHi();
        b2.sayHello();
    }
}
