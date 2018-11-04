package EvidenceSwingFinal;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;

public class Utils {

    public static void main(String[] args) {

    }

    public void writeToFile(String filename,List<Utils> students) {
        File destfile = new File(filename+".txt");
        try {
            if (destfile.exists() == false) {
                System.out.println("We had to Create New File");
                destfile.createNewFile();               
            }
            PrintWriter out = new PrintWriter(new FileWriter(destfile, true));
            for (Utils s : students) {
                out.append(s.getn)
            }
        } catch (Exception e) {
        }
    }

    public void displayFromFile() {
        
    }
}
