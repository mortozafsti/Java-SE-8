
package Swing;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

public class ColorList {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        System.out.println("\nScreen Resolution: "+toolkit.getScreenResolution()+" dots per Inche");
        Dimension dim = toolkit.getScreenSize();
        System.out.println("Screen Size: "+dim.width+" by "+dim.height+" pixels");
        
        GraphicsEnvironment e = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontnames = e.getAvailableFontFamilyNames();
        System.out.println("\nFont Available in this Possition: ");
        int count = 0;
        for (String fontname : fontnames) {
            System.out.print(fontname);
            if (++count % 3  ==0) {
                System.out.println();
            }
        }
        return;
    }
}
