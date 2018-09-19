
package EvidemceTwo;

import java.util.Scanner;

public class MakeSumMultiAddDivision {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the First Number: ");
        float n1 = sc.nextFloat();
        
        System.out.println("Enter the First Number: ");
        float n2 = sc.nextFloat();
        
        float answer = MakeSumMultiAddDivision.makeSumMultiAdd(n1, n2, "+");
        System.out.println(answer);
        //MakeSumMultiAddDivision kk = new MakeSumMultiAddDivision();
       // float d1 = kk.makeSumMultiAdd(3, 6, "/");
        //System.out.println(d1);
        
    }
    public static float makeSumMultiAdd(float n1, float n2, String str){ 
        
        float rs = 0;
        if (str == "+") {
            rs = n1 + n2;
        }else if(str == "-"){ 
            rs = n1 - n2;
        }else if(str == "*"){ 
            rs = n1 * n2;
        }else if(str == "/"){ 
            rs = n1 / n2;
        }else if(str == "%"){ 
            rs = n1 % n2;
        }
        return rs;
    }
}
