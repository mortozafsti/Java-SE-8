
package ExamPractise;

public class TwoDimentionArraySum {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,5},{2,3,5,6},{9,5,6,4}};
        int sum = 0;
        for (int[] is : arr) {
            for (int i : is) {
                System.out.print(i+" ");
                sum +=i;
            }
            System.out.println();
            
        }
        System.out.println("Sum: "+sum);
    }
}
