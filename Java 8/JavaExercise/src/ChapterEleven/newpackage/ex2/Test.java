package ChapterEleven.newpackage.ex2;

import ChapterEleven.*;

public class Test {

    public static void main(String[] args) {

        B b1 = new B();  // b1 is Object and its reference is B class
        A b2 = new B(); // b2 is Object and its reference is A class
        A a1 = new A(); // a1 is Object and its reference is A class

        //////////////////But/////////////
        // B a2 = new A(); child can not be reference of Parent
        C c1 = new C();
        B c2 = new C();
        A c3 = new C();

        System.out.println(b1 instanceof A);
        System.out.println(b2 instanceof A);
        System.out.println(a1 instanceof B);

        System.out.println(c1 instanceof C);
        System.out.println(c2 instanceof C);
        System.out.println(c3 instanceof B);
        
        if (c3 instanceof A) {
            b1.sayHello();
            
        }else{ 
            System.out.println("Does Not Match");
        }

    }

}
