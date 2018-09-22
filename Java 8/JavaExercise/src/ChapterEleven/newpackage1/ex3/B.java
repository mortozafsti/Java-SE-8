
package ChapterEleven.newpackage1.ex3;

public class B extends A{
    
    @Override
    public void sayHello(){ 
        System.out.println("Hi, I am From B Class");
    }
    
    public void sayHi(){ 
        super.sayHello();
         System.out.println("Hi, I am From B Class, Say Hi Method");
    }
}
