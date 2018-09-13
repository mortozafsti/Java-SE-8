/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UsesOfMethods;

/**
 *
 * @author Cf-37
 */
public class MultiMethodCombineResult {

    int p = 10; //It is instance variable
    int q = 200;

    public MultiMethodCombineResult() {
    }
    
    public MultiMethodCombineResult(int p) {
        
    }

    public MultiMethodCombineResult(int p, int q) {
        
    }

    public static void main(String[] args) {
        MultiMethodCombineResult m = new MultiMethodCombineResult();
        int rs = m.substitutefTwoMethod(5, 7);
        System.out.println("The Result is: " + rs);

        m.substitutefTwoMethods(5, 7);
        m.substitutefTwoMethodss();
        MultiMethodCombineResult.substitutefTwoMethodss();
        
        int doSsum = m.dosum();
        System.out.println("  "+doSsum);
    }

    public int sum(int num1, int num2) {
        int rs = num1 + num2;
        return rs;
    }

    public int multi(int num1, int num2) {
        int rs = num1 * num2;
        return rs;
    }

    public int substitutefTwoMethod(int n1, int n2) {
        int rs = multi(n1, n2) - sum(n1, n2);
        return rs;
    }

    public void substitutefTwoMethods(int n1, int n2) {
        int rs = multi(n1, n2) - sum(n1, n2);
        System.out.println("The RS: " + rs);
    }

    public static void substitutefTwoMethodss() {

        System.out.println("I Am Java Programmer");
    }

    public int dosum() {

        return q;
    }
}
