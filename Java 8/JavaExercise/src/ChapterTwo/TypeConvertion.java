
package ChapterTwo;
/**
 *
 * @author User
 */
public class TypeConvertion {
    public static void main(String[] args) {
        int x = 10;
        long y = x;
        System.out.println("X: "+x+"\n"+"Y: "+y);
        
        long p = 15;
        int q = (int)p;
        System.out.println("P: "+p+"\n"+"Q: "+q);
        
        long longvalue = 500;
        int intvalue = (int) longvalue;
        System.out.println("longvalue: "+longvalue+"\n"+"intvalue "+intvalue);
    }
}