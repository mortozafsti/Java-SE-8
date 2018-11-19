
package Util;

import View.DashboardView;
import View.ProductView;
import View.SalesView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuFormAdmin {
    
    public static  JMenuBar menuAdmin(JFrame f){ 
        JMenuBar menubar = new JMenuBar();
        
        JMenu file = new JMenu("File");
        JMenuItem dashboard = new JMenuItem("DasshBoard");
        dashboard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DashboardView().setVisible(true); 
            }
        });
        JMenuItem category = new JMenuItem("Category");
        category.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DashboardView().setVisible(true); 
            }
        });
        JMenuItem purchase = new JMenuItem("Purchase");
        purchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ProductView().setVisible(true); 
            }
        });
        JMenuItem sales = new JMenuItem("Sales");
        sales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SalesView().setVisible(true); 
            }
        });
        JMenuItem summary = new JMenuItem("Summary");
        summary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DashboardView().setVisible(true); 
            }
        });
        JMenuItem user = new JMenuItem("User");
        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DashboardView().setVisible(true); 
            }
        });
        file.add(dashboard);
        file.add(category);
        file.add(purchase);
        file.add(sales);
        file.add(summary);
        file.add(user);
        
        
        JMenu help = new JMenu("Help");
        JMenu signout = new JMenu("Sign Out");
        
        menubar.add(file);
        menubar.add(help);
        menubar.add(signout);
        
        f.setJMenuBar(menubar); 
        
        return menubar;
    }
}
