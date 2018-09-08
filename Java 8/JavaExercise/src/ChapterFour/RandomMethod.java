
package ChapterFour;

/**
 *
 * @author User
 */
public class RandomMethod {
    public static void main(String[] args) {
        int singledigitNumber = (int) (Math.random() * 10);
        System.out.println("Single digit Number: "+singledigitNumber);
        
        int twodigitNumber = (int) (Math.random() * 100);
        //System.out.println("Two digit Number: "+twodigitNumber);
        
        if(twodigitNumber > 9){ 
             System.out.println("Two digit Number: "+twodigitNumber);
        }else{ 
             System.out.println("Two digit Number: "+twodigitNumber+9);
        }
        
        int threedigitNumber = (int) (Math.random() * 1000);
        System.out.println("Two digit Number: "+threedigitNumber);
    }
}
