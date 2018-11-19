
package Domain;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuFormAdmin {
    
    public static  JMenuBar menuAdmin(JFrame f){ 
        JMenuBar menubar = new JMenuBar();
        
        JMenu file = new JMenu("File");
        JMenuItem dashboard = new JMenuItem("DasshBoard");
        JMenuItem category = new JMenuItem("Category");
        JMenuItem purchase = new JMenuItem("Purchase");
        JMenuItem sales = new JMenuItem("Sales");
        JMenuItem summary = new JMenuItem("Summary");
        JMenuItem user = new JMenuItem("User");
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
