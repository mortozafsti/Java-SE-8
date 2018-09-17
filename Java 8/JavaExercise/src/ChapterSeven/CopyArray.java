package ChapterSeven;

public class CopyArray {

    public static void main(String[] args) {
        int[] milton = {4,5,6,7,8,8,9,10};
        int[] mortoza = new int[milton.length];
        for (int i = 0; i < milton.length; i++) {
            mortoza[i] = milton[i];
            //System.out.println("Mortoza Array: "+mortoza[i]);
        }
        for (int i : mortoza) {
            System.out.print(i+" ");
        }
        
        /////new Array/////////////////
        System.out.println("/////////////////////Array Copy//////////////////////");
        int newArray[] =new int[milton.length];
        System.arraycopy(milton,0,newArray,0,milton.length);
        for (int i : newArray) {
            System.out.print(i+" ");
        }
        /////new Array/////////////////
        System.out.println("/////////////////////Array Copy//////////////////////");
        int neArray[] ={1,3,5,7};
        int t[] =new int[10];
        System.arraycopy(neArray,1,t,5,2);
        for (int i : t) {
            System.out.print(i+" ");
        }
        /////new Array/////////////////
        System.out.println("/////////////////////Array Copy jjjj//////////////////////");
        int s[] ={1,3,5,7};
        int s1[] =new int[s.length];
        System.arraycopy(s,0,s1,2,2);
        for (int i : s1) {
            System.out.print(i+" ");
        }
    }
}
