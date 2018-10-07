package ChapterSeventeen;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {

    public static void main(String[] args) throws IOException {
        try (
                DataOutputStream output = new DataOutputStream(new FileOutputStream("milton.txt"));
                
           )  {
            output.writeUTF("John");
            output.writeDouble(85.5);
            output.writeUTF("Jim");
            output.writeDouble(185.5);
            output.writeUTF("Susan");
            output.writeDouble(105.5);  
        }
        try (
                DataInputStream input = new DataInputStream(new FileInputStream("milton.txt"))
                
         ){
            System.out.println(input.readUTF()+" "+input.readDouble());
            System.out.println(input.readUTF()+" "+input.readDouble());
            System.out.println(input.readUTF()+" "+input.readDouble());
        }
    }
}
