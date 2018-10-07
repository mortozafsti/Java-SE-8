package ChapterSeventeen;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileInputStream {

    public static void main(String[] args) throws IOException {
        try (
                FileOutputStream output = new FileOutputStream("rubel.txt");
                
           )  {
            for (int i = 1; i < 10; i++) {
                output.write(i);
            }
        }
        try (
                FileInputStream input = new FileInputStream("rubel.txt")
                
         ){
            int value;
            while ((value = input.read())  != -1){                
                System.out.print(value+" ");
            }
        }
    }
}

