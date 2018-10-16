
package Swing;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.EtchedBorder;

public class TryGridLayOut {
    static JFrame aWindow = new JFrame("This is the Grid Layout");
    public static void main(String[] args) {
        
        Toolkit toolkit = aWindow.getToolkit();
        Dimension dim = toolkit.getScreenSize();
        
        aWindow.setBounds(dim.width/4, dim.height/4, dim.width/2, dim.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridLayout gridlaout = new GridLayout(3, 4);
        Container content = aWindow.getContentPane();
        content.setLayout(gridlaout);
        
        EtchedBorder edge = new EtchedBorder(EtchedBorder.RAISED);
        
        JButton button = null;
        for (int i = 1; i <= 10; i++) {
            content.add(button = new JButton("Press"+i));
            button.setBorder(edge);           
        }
        
        aWindow.pack();
        aWindow.setVisible(true);
        
    }
}
