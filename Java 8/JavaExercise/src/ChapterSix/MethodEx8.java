
package ChapterSix;

/**
 *
 * @author User
 */
public class MethodEx8 {
    //It is separation of concern
    public static void main(String[] args) {
        MethodEx8 re = new MethodEx8();
        int rs =re.makeSubstituteFromMethod(5, 7);
        System.out.println("Result: "+rs);
        
      re.makeMultiSingleMethod(10, 2);
    }
    
    public int makeSum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    public int makeMulti(int num1, int num2) {
        int multi = num1 * num2;
        return multi;
    }
    
    public int makeSubstituteFromMethod(int n1,int n2) {
        int rs = makeMulti(n1,n2) -makeSum(n1, n2);
        return rs;
    }
    public void makeMultiSingleMethod(int num1,int num2){ 
        int rs = (num1*num2)-(num1+num2);
        System.out.println("The Result: "+rs);
    }
}
