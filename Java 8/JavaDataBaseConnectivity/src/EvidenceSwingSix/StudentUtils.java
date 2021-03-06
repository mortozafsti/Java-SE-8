
package EvidenceSwingSix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class StudentUtils {
    public static void main(String[] args) {
        
    }
    public static void writeToFile(String filename,List<Student> students){ 
        File destfile = new File(filename+".txt");
        try {
            if (destfile.exists() == false) {
                System.out.println("W had tocreate new file");
                destfile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(destfile,true));
            for (Student s : students) {
                out.append(s.getId()+", "+s.getPass()+", "+s.getName()+", "+s.getEmail()+", "+s.getAge()+", "+s.getGender()+", "+s.getHobby()+", "+s.getRound()+", "+s.getMsg()+"\n");
            }
            out.close();
        } catch (Exception e) {
            System.out.println("Could not Log");
        }
    }
    public static void displayFromFile(String filename,DefaultTableModel model){ 
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
