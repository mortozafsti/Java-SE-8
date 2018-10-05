
package ChapterEighteen;

public class CheckPoint18PointSeenB {
    public static void main(String[] args) {
        
        xMethod(9);
        
    }
    public static void xMethod(int n){ 
        if (n != 0) {
            
            System.out.println(n+"");
            xMethod(n / 10);
        }
    }
}
