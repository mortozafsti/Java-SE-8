package ChapterSeven;

public class ArrayDeclartionEx {

    //Array Index starts from 0 zero
    //Array is Fixed in size
    //Array Performnce is good
    /*Array works with homogenious(same type like int 
      or String or double ) data*/
    //Array Declaration
    int[] y = new int[3];
    int[] z = new int[5];

    public static void main(String[] args) {
        int[] x = new int[3];
        x[0] = 10;
        x[1] = 25;
        x[2] = 15;
        System.out.println("X[0]: "+x[0]);
        System.out.println("X[1]: "+x[1]);
        System.out.println("X[2]: "+x[2]);
        
        for (int i : x) {
            System.out.println(i);
        }
        //Alternative Array Declaration
        
        int p[] = {10,25,35,23,14,32,2,4,1}; //Length 8 index 7
        System.out.println("p[5]: "+p[5]);
       // p = new int[9];
        for (int j : p) {
            System.out.println(j);
        }
        
    }
}
