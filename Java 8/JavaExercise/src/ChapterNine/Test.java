
package ChapterNine;

public class Test {
    public static void main(String[] args) {
        EncapsulatedObject im = new EncapsulatedObject();
        
        //im.id = 500; private variable can not be Access
        //im.myCar();
        im.myPlan();
        im.myAxe();
        im.getId();
        System.out.println("ID: "+im.getId());
    }
}
