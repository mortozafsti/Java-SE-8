
package Swing;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class SizingWindowWithToolKit {
    
    static JFrame aWindow = new JFrame("This is the Window Sizing ToolKit");
    
    public static void main(String[] args) {
        Toolkit toolKit = aWindow.getToolkit();
        Dimension winSize = toolKit.getScreenSize();
        aWindow.setBounds(winSize.width/4, winSize.height/4, winSize.width/2, winSize.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);        
    }
}
