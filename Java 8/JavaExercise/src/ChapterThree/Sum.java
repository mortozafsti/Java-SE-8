
package ChapterThree;

/**
 *
 * @author User
 */
public class Sum {
    public static void main(String[] args) {
        int i = 10;
        int sum = 0;
        for(i=1; i<=10; i++){ 
            sum += i;
            System.out.println("The num of i is: "+i);
        }
        System.out.println("Total sum of i is: "+sum);
    }
}
