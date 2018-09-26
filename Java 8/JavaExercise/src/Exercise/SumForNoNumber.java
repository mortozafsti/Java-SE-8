
package Exercise;

public class SumForNoNumber {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        while (true) {            
            if (sum > 40) {
                break;
            }else{ 
                sum += n;
            }
            System.out.println("Sum: "+sum);
        }
    }
}
