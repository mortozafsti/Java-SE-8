
package Swing;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;

public class TryCardLayOut extends JApplet implements ActionListener{

    CardLayout cardLAyOut = new CardLayout(50,50);
    
    public void init(){ 
        Container content = getContentPane();
        content.setLayout(cardLAyOut);
        JButton button;
        for (int i = 1; i <= 6; i++) {
           content.add(button = new JButton("Press"+i),"Card"+i);
           button.addActionListener(this);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       cardLAyOut.next(getContentPane());
    }
    
}
