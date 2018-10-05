
package ChapterEighteen;

public class CheckPoint18PointSeenA {
    public static void main(String[] args) {
        
        xMethod(6);
        
    }
    public static void xMethod(int n){ 
        if (n > 0) {
            System.out.println(n+"");
            xMethod(n -1);
        }
    }
}
