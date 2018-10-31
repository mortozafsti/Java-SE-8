/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EvidenceFinal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
            }
            reader.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Buffered Reader Issued");
        }
    }
}

