
package EvidenceFinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
<<<<<<< HEAD
=======
import java.io.IOException;
>>>>>>> 7f6191501f3d3522db1ee34e84422c4750e7edeb
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

<<<<<<< HEAD
public class Utils {

    public static void main(String[] args) {

    }

    public void writeToFile(String filename,List<Student> students) {
        File destfile = new File(filename+".txt");
        try {
            if (destfile.exists() == false) {
                System.out.println("We had to Create new File");
                destfile.createNewFile();
                
            }
            PrintWriter out = new PrintWriter(new FileWriter(destfile,true));
            for (Student s : students) {
                out.append(s.getName()+", "+s.getEmail()+", "+s.getAge()+", "+s.getGender()+", "+s.getHobby()+", "+s.getRound()+", "+s.getNote()+"\n");
                
            }
            out.close();
        } catch (Exception e) {
            System.out.println("Could not Log");
        }
    }

    public void displayFromFile(String filename,DefaultTableModel model) {
        String line;
        BufferedReader reader;
        
        try {
            reader = new BufferedReader(new FileReader(filename+".txt"));
            while ((line=reader.readLine()) != null) {
               model.addRow(line.split(", "));  
=======
/**
 *
 * @author Cf-37
 */
public class Utils {
    public static void main(String[] args) {
        
    }
    public static void writeToFile(String filename,List<Student> students) throws Exception{ 
        File destfile = new File(filename+".txt");
        try {
            if (destfile.exists() == false ) {
            System.out.println("We had to create New file");
            destfile.createNewFile();
        }
            PrintWriter out = new PrintWriter(new FileWriter(destfile,true));
            for (Student s : students) {
                out.append(s.getName()+", "+s.getEmail()+", "+s.getAge()+", "+s.getGender()+", "+s.getHobby()+", "+s.getRound()+", "+s.getNote()+"\n");
               
            }
             out.close();
        } catch (IOException e) {
            System.out.println("Could not Log");
        }
    }
    public static void displayFromFile(String filename,DefaultTableModel model) throws Exception{ 
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename+".txt"));
            while ((line=reader.readLine()) != null) {
               model.addRow(line.split(", "));
>>>>>>> 7f6191501f3d3522db1ee34e84422c4750e7edeb
            }
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Buffered Reader Issued");
        }
    }
}

