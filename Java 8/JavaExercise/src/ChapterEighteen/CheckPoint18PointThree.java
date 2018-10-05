
package ChapterEighteen;

public class CheckPoint18PointThree {
    public static void main(String[] args) {
        xMethod(123456789);
        
    }
    public static void xMethod(int m){ 
        if (m > 0) {
            System.out.print(m % 10);
            xMethod(m / 10);
            
        }
        
    }
}
