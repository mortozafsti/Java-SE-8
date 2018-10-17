package swingapplication;

import View.New;
import View.Open;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
        item1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new New().setVisible(true);
            }
        });
        JMenuItem item2 = new JMenuItem("Open");
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

        file.add(item1);
        file.add(item2);
        file.add(item3);

        f.setJMenuBar(jmenubar);
    }

}
