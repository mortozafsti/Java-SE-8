package ChapterSeventeen;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class NewClass {

    public static void main(String[] args) throws IOException {
        try (
                FileOutputStream fileOut = new FileOutputStream("gm.txt");) {
            for (int i = 1; i <= 10; i++) {
                fileOut.write(i);
                System.out.println(i);
            }
        }
        try (
                FileInputStream Out = new FileInputStream("mortoza.txt");) {
            int value;
            while ((value = Out.read()) != 1) {
                System.out.println(value + " ");
            }
        }
    }
}
