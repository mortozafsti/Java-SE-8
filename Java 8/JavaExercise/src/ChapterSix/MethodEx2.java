package ChapterSix;

/**
 *
 * @author User
 */
public class MethodEx2 {

   static int p; //instance variable
   static int q = 400;

   //Create a Constractor
   //Constractor must be create at class name
   //It is default constrator
   //It has a name named according to class name
   //It must have a body
   //Parameter/argument is optional
   //constractor Two types A.Default B.Argumentive Constractor
   //Without any paramater is called default constractor
   //If constractor has one or more arguments or paramater,then it is called argumentive constractor
   //What is constractor overloading ? Give an Example.
    public MethodEx2() {
        
    }
    //Argumentive Constractor
    public MethodEx2(int p) {
        this.p = p;
    }
    public static void main(String[] args) {
        
        //Calling Method Way 1
        System.out.println(display1());
        System.out.println(display2());
        System.out.println(display3());
        System.out.println(display4());
        
        //Calling Method Way 2
        System.out.println("=============Way 2");
        int m1 = display1();
        System.out.println("M1: "+m1);
        int m2 = display2();
        System.out.println("M2: "+m2);
        int m3 = display3();
        System.out.println("M3: "+m3);
        int m4 = display4();
        System.out.println("M4: "+m4);
        
        //Calling Method Way 3
        System.out.println("=============Way 3");
        //Make a Object of Class MethodEx2:
        MethodEx2 m = new MethodEx2();
        System.out.println("Method1: "+m.display1());
        System.out.println("Method1: "+m.display2());
        System.out.println("Method1: "+m.display3());
        System.out.println("Method1: "+m.display4());
        
    }
    public static int display1() {
        return 100;
    }

    //Method 4:
    public static int display2() {
        int x = 200;
        return x;
    }

    //Method 5:
    public static int display3() {
        int p = 300;
        return p;
    }

    //Method 6:
    public static int display4() {
        
        return q;
    }

}
