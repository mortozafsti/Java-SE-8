
package EvidemceTwo;

public class MakeSum4 {
    public static void main(String[] args) {
        
        MakeSum4 jj = new MakeSum4();
        int dd = jj.makeSum(10, -1);
        System.out.println(dd);
        
    }
    public static int makeSum(int n1, int n2){ 
        int sum = 0;
        if (n1 > 0 || n2 > 0) {
            if (n1 > n2) {
                while (n1 >= n2) {                    
                    sum +=n1;
                    n1--;
                }
            }else if(n1 < n2){ 
                while (n1 <= n2) {                    
                    sum +=n1;
                    n1++;
                }
            }else if(n1 == n2){ 
                while (n1 == n2) {                    
                    sum = n1;
                }
            }
        }else{ 
                sum = -1;
            }
        return sum;
    }
}
