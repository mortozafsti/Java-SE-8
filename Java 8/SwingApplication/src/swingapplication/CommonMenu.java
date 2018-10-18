package swingapplication;

import View.New;
import View.Open;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class CommonMenu {

    public static void main(String[] args) {

        JFrame f = new JFrame("Common Menu");
        getCommonMenu(f);

        f.setBounds(10, 20, 400, 250);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }

    public static void getCommonMenu(JFrame f) {

        JMenuBar jmenubar = new JMenuBar();
        JMenu file = new JMenu("File");
        jmenubar.add(file);

        JMenu help = new JMenu("Help");
        jmenubar.add(help);
        JMenu about = new JMenu("About");
        jmenubar.add(about);
        
        JMenuItem item1 = new JMenuItem("New");
        item1.setMnemonic('N');
        item1.setAccelerator(KeyStroke.getKeyStroke('N',InputEvent.CTRL_DOWN_MASK));
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new New().setVisible(true);
            }
        });
        JMenuItem item2 = new JMenuItem("Open");
        Object obj = new Object();
        item2.setIcon(new ImageIcon(obj.getClass().getResource("/View/coding.png")));
        
        item2.setMnemonic('O');
        item2.setAccelerator(KeyStroke.getKeyStroke('O',InputEvent.CTRL_DOWN_MASK));
        item2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);

                new Open().setVisible(true);
            }
        });
        JMenuItem item3 = new JMenuItem("Ecit");
        item3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        JMenuItem item4 = new JMenuItem("Ecit");
        file.add(item1);
        file.add(item2);
        file.add(item3);

        f.setJMenuBar(jmenubar);
    }

}
