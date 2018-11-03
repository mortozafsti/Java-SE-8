
package EvidenceSwingOne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Utils {
    
    public static void writeToFile(String filename,List<Student> students){ 
        File destfile = new File(filename+".txt");
        try {
            if (destfile.exists() == false) {
                System.out.println("We had to create new File");
                destfile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(destfile, true));
            for (Student s : students) {
                out.append(s.getName()+", "+s.getAge()+", "+s.getEmail()+", "+s.getGender()+", "+s.getHobby()+", "+s.getRound()+", "+s.getNote()+"\n");
            }
            out.close();
        } catch (Exception e) {
        }
    }
    public static void displayFromFile(String filename, DefaultTableModel model){ 
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename+".txt"));
            while ((line=reader.readLine()) != null) {
                model.addRow(line.split(", "));
                
            } 
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Buffered Reader Issued");
        }
    }
    public static void updateDataInTable(String filename, DefaultTableModel model){ 
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename+".txt"));
            while ((line=reader.readLine()) != null) {
                model.addRow(line.split(", "));
                
            } 
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Buffered Reader Issued");
        }
    }
}
