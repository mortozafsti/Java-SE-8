
package ChapterThree;

/**
 *
 * @author User
 */
public class CheckPoint1 {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        
        switch(x + 3){ 
            case 6: y = 1;
            default: y += 1;
        }
        System.out.println("After Switch Statement Y: "+y);
    }
}
