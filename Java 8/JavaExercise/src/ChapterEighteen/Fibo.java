
package ChapterEighteen;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int dd = sc.nextInt();
        
        System.out.println("The Fibo Number: "+dd+" is "+fib(dd));
        
      
    }
    public static long fib(long ddd){ 
        if (ddd == 0) {
            return 0;
        }else if(ddd == 1){ 
            return 1;
        }else { 
            return fib(ddd - 1) + fib(ddd -2);
        }
    }
}

