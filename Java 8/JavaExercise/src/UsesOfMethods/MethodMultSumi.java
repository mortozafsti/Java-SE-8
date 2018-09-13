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
public class MethodMultSumi {
    public int makeSubstituteFromTwoMethod(int n1,int n2){ 
        MethodSum ms = new MethodSum();
        MethodMulti mm = new MethodMulti();
        int rs = mm.makeMulti(n1, n2) - ms.makeSum(n1, n2);
        return rs;
    }
}
