/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterSix;

/**
 *
 * @author User
 */
public class MethodEx5 {
    //Two types of Method A.General Method and B.Abstract Method

    double balance = 5000; //instance Variable

    public static void main(String[] args) {
        MethodEx5 m = new MethodEx5();
        boolean rs = m.Checkbalance(2000.0);
        System.out.println("Result: "+rs);
    }

    public  boolean Checkbalance(double withdrew) {
        balance -= withdrew;
        if (balance >= 1000.0) {
            return true;
        }
        return false;
    }
}
