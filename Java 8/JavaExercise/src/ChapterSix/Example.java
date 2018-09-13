/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterSix;

import static ChapterSix.Example.display;


/**
 *
 * @author User
 */
public class Example {
    
   static int p;
   static int q = 500;
   

    public Example() {
    }
    
    public Example(int p) {
        this.p = p;
    }
    
    public Example(int p,int q) {
        this.p = p;
        this.q = q;
    }
    public static void main(String[] args) {
        //Way 1
        System.out.println("Result: "+display());
        System.out.println("Result: "+display1());
        //Way 2
        int m =  display();
        System.out.println("Result: "+m);
        int m1 =  display1();
        System.out.println("Result: "+m1);
        //Way 3
        Example mm = new Example();
        System.out.println("Result: "+mm.display());
        System.out.println("Result: "+mm.display1());
        System.out.println("Result 3: "+mm.display2());
        System.out.println("Result 3: "+mm.display());
        
    }
    
    public static int display(){ 
        int x = 10;
        return x;
    }
    public static int display1(){ 
        int p;
        return p = 200;
    }
    public static int display2(){ 
        int p;
        return p = 200;
    }
    public static int display3(){ 
        return q;
    }
}
