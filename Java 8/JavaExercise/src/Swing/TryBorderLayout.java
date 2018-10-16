
package Swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Menu;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.border.EtchedBorder;

public class TryBorderLayout {
    static JFrame aWindow = new JFrame("This is the Border LayOut");
    public static void main(String[] args) {
        Toolkit toolkit = aWindow.getToolkit();
        Dimension dim = toolkit.getScreenSize();
        aWindow.setBounds(dim.width/4, dim.height/4, dim.width/2, dim.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        BorderLayout borderlayOut = new BorderLayout();
        Container content = aWindow.getContentPane();
        content.setLayout(borderlayOut);
        
        EtchedBorder edge = new EtchedBorder(EtchedBorder.RAISED);
        JButton jbutton;
        
        content.add(jbutton = new JButton("East"),BorderLayout.EAST);
        jbutton.setBorder(edge);
        content.add(jbutton = new JButton("West"),BorderLayout.WEST);
        jbutton.setBorder(edge);
        content.add(jbutton = new JButton("North"),BorderLayout.NORTH);
        jbutton.setBorder(edge);
        content.add(jbutton = new JButton("South"),BorderLayout.SOUTH);
        jbutton.setBorder(edge);
        content.add(jbutton = new JButton("Center"),BorderLayout.CENTER);
        jbutton.setBorder(edge);
        
        aWindow.setVisible(true);
        
    }
}
