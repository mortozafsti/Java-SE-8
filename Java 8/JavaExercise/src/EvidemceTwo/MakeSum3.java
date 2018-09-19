package EvidemceTwo;

public class MakeSum3 {

    public static void main(String[] args) {

        MakeSum3 m = new MakeSum3();
        int d = m.makeSum3(10, 1);
        System.out.println(d);
        
    }

    public static int makeSum3(int n1, int n2) {
        int sum = 0;
        if (n1 > 0 || n2 > 0) {
            if (n1 > n2) {
                for (int i = n1; i >= n2; i--) {
                    sum += i;
                }
            } else if (n1 < n2) {
                for (int i = n1; i <= n2; i++) {
                    sum += i;
                }
            } else if (n1 == n2) {
                sum = n1;
            }
        } else {
            sum = -1;
        }
        return sum;
    }
}
