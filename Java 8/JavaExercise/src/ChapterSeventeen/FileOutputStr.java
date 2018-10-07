package ChapterSeventeen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStr {

    public static void main(String[] args) throws IOException {

        try (
                FileOutputStream output = new FileOutputStream("kaka.txt")) {
            for (int i = 1; i <= 10; i++) {
                output.write(i);
                //System.out.println(i);
            }
        }
        try (
                FileInputStream input = new FileInputStream("kaka.txt")) {
                int value;
                while ((value = input.read()) != 1) {
                    System.out.println(value+" ");
                
            }
        }
    }
}
