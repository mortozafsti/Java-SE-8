
package ChapterNineteen;


import java.util.ArrayList;

public class GenericsStack<E> {
   ArrayList<E> list = new ArrayList<>();
    
   public int getSize(){ 
       return list.size();
   }
   public E peek(){ 
       return list.get(getSize() - 1);
   }
   public void push(E o){ 
       list.add(o);
   }
   public E pop(){ 
      E o = list.get(getSize() - 1);
      list.remove(getSize() - 1);
      return o;
   }
   public boolean isEmpty(){ 
       return list.isEmpty();
   }

    @Override
    public String toString() {
        return "GenericsStack{" + "list=" + list + '}';
    }
    public static void main(String[] args) {
        GenericsStack<String> stack = new GenericsStack<>();
        stack.push("London");
        stack.push("Paris");
        stack.push("Berlin");
        stack.pop();
        
        
        System.out.println("This is Output: "+stack);
    }
}
