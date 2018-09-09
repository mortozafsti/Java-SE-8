package Exercise;

/**
 *
 * @author Cf-37
 */
public class Nestedif {

    public static void main(String[] args) {
        int k = 50;
        int j = 10;
        int i = 10;

        if (i > k) {
            if (j > k) 
                System.out.println("i and j are gratter than k");
            else{ 
                System.out.println("i is less then or equal to k");
            }
        }
    }
}
