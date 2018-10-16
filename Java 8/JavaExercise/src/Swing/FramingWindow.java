
package Swing;

import javax.swing.JFrame;

public class FramingWindow {
    
    static JFrame aWindow = new JFrame("This is the Window Title");
    
    public static void main(String[] args) {
        int winWidth = 400;
        int winHeight = 300;
        aWindow.setBounds(100, 200, winWidth, winHeight);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
        
    }
}
