
package Swing;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class ColorandCourser {
    
    static JFrame aWindow = new JFrame("This is the Window Title");
    
    public static void main(String[] args) {
        Toolkit toolkit = aWindow.getToolkit();
        Dimension dim =toolkit.getScreenSize();
        
        aWindow.setBounds(dim.width/4, dim.height/4, dim.width/2, dim.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
        aWindow.getContentPane().setBackground(Color.PINK);
        aWindow.setVisible(true);
        
    }
}
