/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamFive;

import com.sun.org.apache.xerces.internal.impl.xs.identity.UniqueOrKey;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Cf-37
 */
public class RandiomNumber {

    public static void main(String[] args) {
        Random rand = new Random(100);
        Set<Integer> uique = new HashSet<Integer>();

        for (int i = 0; i < 10; i++) {
            int dd = rand.nextInt(10)+90;
            uique.add(dd);
        }
        for (Integer integer : uique) {
            System.out.println(integer+" ");
        }
    }
}
