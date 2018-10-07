package ChapterSeventeen;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DetectEndofFile {

    public static void main(String[] args) {
        try {
            try (
                    DataOutputStream output = new DataOutputStream(new FileOutputStream("titu.dat"))) {
                output.writeDouble(4.5);
                output.writeDouble(43.25);
                output.writeDouble(3.2);
            }
            try (
                    DataInputStream input = new DataInputStream(new FileInputStream("titu.dat"))) {
                while (true) {                    
                    System.out.println(input.readDouble());
                }
            }

        } catch (EOFException e) {
            System.out.println("All data were read");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
