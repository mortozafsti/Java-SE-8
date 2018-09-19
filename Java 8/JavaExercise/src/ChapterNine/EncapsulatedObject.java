package ChapterNine;

public class EncapsulatedObject {

    private static int id;
    protected static String name;

    public EncapsulatedObject() {
    }

    public static void main(String[] args) {
        EncapsulatedObject im = new EncapsulatedObject();
        id = 200; // direct Access
        im.myCar();
        im.id = 500;
        System.out.println(id);
    }

    private void myCar() {
        System.out.println("My Car is Private");
    }

    void myPlan() {
        System.out.println("My Planr is Default");
    }
   protected void myAxe() {
        System.out.println("My Axe is Protected");
    }

    public static int getId() {
        return id;
    }
   
}
