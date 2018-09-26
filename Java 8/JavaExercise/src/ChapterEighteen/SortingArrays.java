
package ChapterEighteen;

import java.util.Arrays;
import java.util.Collections;

public class SortingArrays {
    
    public static void main(String[] args) {
        
        int[] arr = {4,2,1,8,6,9};
        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
        int[] a = {4,2,1,8,6,9};
        Arrays.sort(a);
        Collections.reverse(Arrays.asList(a));
        for (int i : a) {
            System.out.print(i);
        }
        System.out.println();
        int[] b = {4,2,1,8,6,9};
        Arrays.sort(b);
        for (int i = b.length-1; i >= 0; i--) {
            System.out.print(b[i]);
        }
        System.out.println();
        
        int[] c = {10,3,1,2,5,9,8,7};
        Arrays.sort(c);
        Collections.reverse(Arrays.asList(c));
        System.out.println("Modifies Array: "+Arrays.toString(c));
        
        disPlayArrays(1,5,6,8,4,7);
        
    }
    
    static void disPlayArrays(int... n){ 
        System.out.println(Arrays.toString(n));
    }
}

