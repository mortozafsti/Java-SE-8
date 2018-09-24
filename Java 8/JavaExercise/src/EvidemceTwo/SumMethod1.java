package EvidemceTwo;

public class SumMethod1 {

    public static void main(String[] args) {
        SumMethod1 dd = new SumMethod1();
        int d = dd.doSum(10, 1);
        System.out.println("" + d);
    }

    public static int doSum(int n1, int n2) {
        int sum = 0;
        if (n1 > 0 || n2 > 0) {
            if (n1 > n2) {
                for (n1 = 0; n2 > n1; n1--) {
                    sum += n2;
                    sum--;
                }
            } else if (n1 < n2) {
                for (n1 = 0; n1 < n2; n1++) {
                    sum += n1;
                    sum++;
                }
            } else if (n1 == n2) {
                sum = n1;
            } else {
                sum = -1;
            }
        }
        return sum;
    }
}
