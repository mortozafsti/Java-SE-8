
package Swing;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TryFlowLayOut {
    static JFrame awindow = new JFrame("This is the FlowlayOut");
    public static void main(String[] args) {
        Toolkit toolKit = awindow.getToolkit();
        Dimension dim = toolKit.getScreenSize();
        awindow.setBounds(dim.width/4, dim.height/4, dim.width/2, dim.height/2);
        awindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FlowLayout flow = new FlowLayout(FlowLayout.LEFT,20 ,30);
        Container content = awindow.getContentPane();
        content.setLayout(flow);
        
        for (int i = 01; i <= 6; i++) {
            content.add(new JButton("Press"+i));
        }
        awindow.setVisible(true);
        awindow.pack();
    }
}
