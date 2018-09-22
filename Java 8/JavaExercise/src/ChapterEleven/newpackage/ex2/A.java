
package ChapterEleven.newpackage.ex2;

import ChapterEleven.*;

public class A {
    
    int id;
    String name;
    String color;

    public A() {
    }
    
    public A(int id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }
    
    public void sayHello(){ 
        System.out.println("Hi, How are You?");
    }
}
