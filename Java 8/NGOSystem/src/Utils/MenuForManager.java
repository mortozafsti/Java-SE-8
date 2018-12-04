package Utils;

import View.AddMemberView;
import View.DailyCollectionReportView;
import View.DailyColllectionView;
import View.LoginView;
import View.MainView;
import View.UserView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuForManager {

    public static JMenuBar menuManager(JFrame f) {

        JMenuBar jMenuBar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenuItem dashboard = new JMenuItem("DashBoard");
        dashboard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   new MainView().setVisible(true);
                   f.setVisible(false); 
            }
        });
        JMenuItem adduser = new JMenuItem("Add New User");
        adduser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   new UserView().setVisible(true);
                   f.setVisible(false); 
            }
        });
        JMenuItem addmember = new JMenuItem("Add Member");
        addmember.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   new AddMemberView().setVisible(true);
                   f.setVisible(false); 
            }
        });
        JMenuItem dailycollection = new JMenuItem("Daily Collection");
        dailycollection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   new DailyColllectionView().setVisible(true);
                   f.setVisible(false); 
            }
        });
        JMenu report = new JMenu("Report");
        JMenuItem monthlycollection = new JMenuItem("Monthly Collection");
        monthlycollection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   new DailyCollectionReportView().setVisible(true);
                   f.setVisible(false); 
            }
        });
        JMenu help = new JMenu("Help");
        
        JMenu signout = new JMenu("SignOut");
        JMenuItem sout = new JMenuItem("Sign Out");
        sout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   new LoginView().setVisible(true);
                   f.setVisible(false); 
                   
            }
        });

        file.add(dashboard);
        file.add(adduser);
        file.add(addmember);
        file.add(dailycollection);
        
        report.add(monthlycollection);
        signout.add(sout);

        jMenuBar.add(file);
        jMenuBar.add(report);
        jMenuBar.add(help);
        jMenuBar.add(signout);

        f.setJMenuBar(jMenuBar);

        return jMenuBar;
    }

}
