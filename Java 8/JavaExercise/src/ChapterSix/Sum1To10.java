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
public class Sum1To10 {

    public static void main(String[] args) {
        Sum1To10 n = new Sum1To10();
        int bb = n.Sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Result: " + bb);

    }

    public int Sum(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        int rs = a + b + c + d + e + f + g + h + i + j;
        return rs;
    }
}
