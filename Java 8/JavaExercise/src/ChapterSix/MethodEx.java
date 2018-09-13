package ChapterSix;

/**
 *
 * @author User
 */
public class MethodEx {

    String abc;
    String msg;
    //Main Meyhod
    public static void main(String[] args) {
        MethodEx mm = new MethodEx();
        System.out.println("M: "+mm.display());
        System.out.println("M: "+mm.display2());
    }

    //Simple  Meyhod
    //1.Access modifer like public,protected,private,default
    //if empty then it is default
    //2.data type primitive type(int,long,float,double,short,byte,boolean) or class type(String or any class name) or void
    //if public is void, then method will not return anything
    //syntax of method
    //Access modifer>+data typr>+method Name>+parameter is optional+{}
    //Method 1:
    public String display() {
        String n = "I am Void Method";
        return n;
    }

    //Method 2: data type is int so we must return kwyword and
    public int display2() {
        int x = 10;
        return x;
    }

    //Method 3:
    public String display3() {
        return "Hello Word";
    }
    
    //Method 4:
    public String display4() {
         String str =  "Hello Word";
         return str;
    }
    //Method 5:
    public String display5() {
        abc =  "Hello Word";
         return abc;
    }
    //Method 6:
    public String display6() {
        
         return msg;
    }
}
