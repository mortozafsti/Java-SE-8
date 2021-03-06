
package Util;

import View.DashboardView;
import View.ProductView;
import View.PurchaseReportView;
import View.SalesView;
import View.UserReportView;
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
                f.setVisible(false); 
            }
        });
        JMenuItem category = new JMenuItem("Category");
        category.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DashboardView().setVisible(true); 
                f.setVisible(false);
            }
        });
        JMenuItem purchase = new JMenuItem("Purchase");
        purchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ProductView().setVisible(true); 
                f.setVisible(false);
            }
        });
        JMenuItem sales = new JMenuItem("Sales");
        sales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SalesView().setVisible(true); 
                f.setVisible(false);
            }
        });
        JMenuItem summary = new JMenuItem("Summary");
        summary.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DashboardView().setVisible(true); 
                f.setVisible(false);
            }
        });
        JMenuItem user = new JMenuItem("User");
        user.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DashboardView().setVisible(true); 
                f.setVisible(false);
            }
        });
        
        
        
        JMenu report = new JMenu("Report");
        JMenuItem purchaseR = new JMenuItem("Purchase Report");
        
        purchaseR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new PurchaseReportView().setVisible(true); 
               f.setVisible(false);
            }
        });
        JMenuItem salesR = new JMenuItem("Sales Report");
        salesR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              // new SalesView().setVisible(true); 
            }
        });
        JMenuItem userR = new JMenuItem("User Report");
        userR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new UserReportView().setVisible(true); 
               f.setVisible(false);
            }
        });
        
        
        JMenu help = new JMenu("Help");
        JMenu signout = new JMenu("Sign Out");
        
        file.add(dashboard);
        file.add(category);
        file.add(purchase);
        file.add(sales);
        file.add(summary);
        file.add(user);
        file.add(report);
        
        report.add(purchaseR);
        report.add(salesR);
        report.add(userR);
        
        menubar.add(file);
        menubar.add(report);
        menubar.add(help);
        menubar.add(signout);
        
        
        f.setJMenuBar(menubar); 
        
        return menubar;
    }
}
