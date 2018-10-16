
package Swing;

import static Swing.TryGridLayOut.aWindow;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.Border;

public class TryBoxLayOut {
    static JFrame aWindow = new JFrame("This is the Box LayOut");
    public static void main(String[] args) {
        Toolkit toolkit = aWindow.getToolkit();
        Dimension dim = toolkit.getScreenSize();
        
        aWindow.setBounds(dim.width/4, dim.height/4, dim.width/2, dim.height/2);
        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Box left = Box.createVerticalBox();
        left.add(Box.createVerticalStrut(20));
        ButtonGroup radiogroup = new ButtonGroup();
        JRadioButton rbutton;
        radiogroup.add(rbutton = new JRadioButton("Red"));
        left.add(rbutton);
        left.add(Box.createVerticalStrut(20));
        left.add(Box.createGlue());
        radiogroup.add(rbutton = new JRadioButton("Green"));
        left.add(rbutton);
        left.add(Box.createVerticalStrut(20));
        radiogroup.add(rbutton = new JRadioButton("Blue"));
        left.add(rbutton);
        radiogroup.add(rbutton = new JRadioButton("Yellow"));
        left.add(rbutton);
        
        //Create Right Column of CheckBoxes
        Box right = Box.createVerticalBox();
        right.add(new JCheckBox("Dashed"));
        right.add(new JCheckBox("Thick"));
        right.add(new JCheckBox("Rounded"));
        
        //Create top row to hold left and right
        Box top = Box.createHorizontalBox();
        top.add(left);
        top.add(right);
        
        //Create bottom row of buttons
        JPanel bottomPannel = new JPanel();
        Border edge = BorderFactory.createRaisedBevelBorder();
        JButton button;
        Dimension size = new Dimension(80, 20);
        bottomPannel.add(button = new JButton("Defaults"));
        button.setBorder(edge);
        button.setPreferredSize(size);
        bottomPannel.add(button = new JButton("OK"));
        button.setBorder(edge);
        button.setPreferredSize(size);
        bottomPannel.add(button = new JButton("Cancel"));
        button.setBorder(edge);
        button.setPreferredSize(size);
        
        //Add top to bottom pannel to content pane
        Container content = aWindow.getContentPane();
        content.setLayout(new BorderLayout());
        content.add(top, BorderLayout.CENTER);
        content.add(bottomPannel,BorderLayout.SOUTH);
        
        aWindow.pack();
        aWindow.setVisible(true);
        
    }
}
