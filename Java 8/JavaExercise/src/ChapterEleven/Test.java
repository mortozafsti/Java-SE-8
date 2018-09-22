
package ChapterEleven;

public class Test {
    public static void main(String[] args) {
        
        B b1 = new B();  // b1 is Object and its reference is B class
        A b2 = new B(); // b2 is Object and its reference is A class
        A a1 = new A(); // a1 is Object and its reference is A class
        
        //////////////////But/////////////
       // B a2 = new A(); child can not be reference of Parent
    }
  
}
