
package AccessModefier;

public class TestOne {
   
   private static int id;
   protected static int name;
   
    public static void main(String[] args) {
        TestOne t = new  TestOne();
        t.myCar();
        t.id=20;
        System.out.println("ID: "+t.id);
    }
    
    private void myCar(){ 
        System.out.println("I am Private");
    }
    protected void myCar1(){ 
        System.out.println("I am  Protected");
    }
    public void myCar2(){ 
        System.out.println("I am  public");
    }
    void myplane(){ 
        System.out.println("I am default");
    }
    public void myplane1(){ 
        System.out.println("I am default");
    }
}
