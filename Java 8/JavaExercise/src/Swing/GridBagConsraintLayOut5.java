
package Swing;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class GridBagConsraintLayOut5 {
    static JFrame awindow = new JFrame("This is the GridBag Constraint Layout");
    public static void main(String[] args) {
        Toolkit toolkit = awindow.getToolkit();
        Dimension dim = toolkit.getScreenSize();
        awindow.setBounds(dim.width/4, dim.height/4, dim.width/2, dim.height/2);
        awindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints constraint =  new GridBagConstraints();
        awindow.getContentPane().setLayout(gridBag);
        
        constraint.weightx = constraint.weighty = 10.0;
        constraint.fill = constraint.NONE;
        constraint.ipadx = 30;
        constraint.ipady = 10;
        addButton("Press", constraint, gridBag);
               
        
        constraint.weightx = 5.0;
        constraint.fill = constraint.BOTH;
        constraint.ipadx = constraint.ipady = 0;
        constraint.gridwidth = constraint.REMAINDER;
        constraint.gridheight = 2;      
        constraint.insets = new Insets(10, 30, 10, 20);        
        addButton("Go", constraint, gridBag);

        constraint.gridx = 0;
        constraint.fill = constraint.NONE;
        constraint.ipadx = 30;
        constraint.ipady = 10;
        constraint.gridwidth = 1;
        constraint.gridheight = 1;
        constraint.insets = new Insets(0, 0, 0, 0);
        addButton("Push", constraint, gridBag);
        
        awindow.setVisible(true);
       
    }
    static void addButton(String label,GridBagConstraints constraints,GridBagLayout layout){ 
        Border edge = BorderFactory.createRaisedBevelBorder();
        
        JButton button = new JButton(label);
        button.setBorder(edge);
        layout.setConstraints(button, constraints);
        awindow.getContentPane().add(button);    
    }
}
