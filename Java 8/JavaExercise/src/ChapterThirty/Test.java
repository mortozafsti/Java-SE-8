
package ChapterThirty;

public class Test implements Runnable {

    public Test() {
        Test test = new Test();
        new Thread(test).start();
    }

    
    @Override
    public void run() {
        System.out.println("test");
    }

}
