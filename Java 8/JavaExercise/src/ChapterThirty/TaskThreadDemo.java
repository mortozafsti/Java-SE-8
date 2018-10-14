package ChapterThirty;

public class TaskThreadDemo {

    public static void main(String[] args) {

        Runnable printA = new printChar('a', 100);
        Runnable printB = new printChar('b', 100);
        Runnable print100 = new PrintNum(100);
        
        Thread tread1 = new Thread(printA);
        Thread tread2 = new Thread(printB);
        Thread tread3 = new Thread(print100);
        
        tread1.start();
        tread2.start();
        tread3.start();
    }
}

class printChar implements Runnable {

    private char charPrint;
    private int items;

    public printChar(char c, int t) {
        charPrint = c;
        items = t;
    }

    @Override
   synchronized public void run() {
        System.out.println(charPrint);
    }

}

  class PrintNum implements Runnable {

    private int lastNum;

    public PrintNum(int n) {
        lastNum = n;
    }

    @Override
   synchronized public void run() {
        for (int i = 1; i <= lastNum; i++) {
            if (i == 30) {
                break;
            }
            System.out.println(" " + i);
        }
    }

}
