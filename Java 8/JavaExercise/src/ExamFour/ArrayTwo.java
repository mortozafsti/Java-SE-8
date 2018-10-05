/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExamFour;

import java.util.Arrays;

/**
 *
 * @author Cf-37
 */
public class ArrayTwo {
    public static void main(String[] args) {
        int[][] aa = {{9,6,4,3},{1,8,9,2,3},{1,2,6,7},{4,9,8,5},{2,3,6,7}};
        Arrays.sort(aa[0]);
        Arrays.sort(aa[1]);
        Arrays.sort(aa[2]);
        Arrays.sort(aa[3]);
        Arrays.sort(aa[4]);
        for (int[] is : aa) {
            for (int i : is) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
