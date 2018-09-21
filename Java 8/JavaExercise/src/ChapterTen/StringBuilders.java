
package ChapterTen;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder strb = new StringBuilder();
        
        strb.append("ABCDEFGHIJK");
        
        strb.insert(4,"RRRR");
        strb.delete(2, 6);
        strb.replace(5, 8,"wwww");
       // strb.reverse();
        strb.setCharAt(0, 'C');
        
        
        System.out.print(strb);
        
    }

}
