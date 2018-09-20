
package ChapterTen;

public class StackDemo {
    
    public static void main(String[] args) {
        Stack st = new Stack();
        
        st.push("Java");
        st.push("Source");
        st.push("Code");
        
        System.out.println("Removed Object is: "+st.pop());
        
        
        System.out.println("Elements after Removed : "+st);
    }
}
