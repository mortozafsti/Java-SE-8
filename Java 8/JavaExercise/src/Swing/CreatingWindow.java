
package Swing;

import java.awt.GraphicsEnvironment;
import java.awt.Point;
import javax.swing.JFrame;

public class CreatingWindow {
    
    static JFrame aWindow = new JFrame("This is the Window Title");
    
    public static void main(String[] args) {
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int winWidth = 400;
        int winHeight = 300;
        aWindow.setBounds(center.x-winWidth/2,center.y-winHeight/2, winWidth, winHeight);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
        
    }
}
