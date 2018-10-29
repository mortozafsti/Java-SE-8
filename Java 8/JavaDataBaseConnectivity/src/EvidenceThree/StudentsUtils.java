package EvidenceThree;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.tree.DefaultTreeModel;

public class StudentsUtils {

    public static void main(String[] args) {

    }

    public static void writeToFile(String filename, List<Student> students) throws Exception {
        File destfile = new File(filename + ".txt");
        if (destfile.exists() == false) {
            System.out.println("We had to Create New file");
            destfile.createNewFile();
        }
        PrintWriter out = new PrintWriter(new FileWriter(destfile, true));
        for (Student s : students) {
            out.append(s.getName() + ", " + s.getEmail() + ", " + s.getAge() + ", " + s.getGender() + ", " + s.getHobby() + ", " + s.getRound() + ", " + s.getNote() + "\n");

        }
        out.close();
    }

    public static void displayFromFile(String filename, DefaultTreeModel model) {
            String line;
            BufferedReader reader;
            
    }
}
