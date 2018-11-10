
package Invebtory;

import static Invebtory.CtratingTable.ProductTable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
    
    public static void main(String[] args) {
        
        
//        Catagory c = new Catagory();
//        c.setId(3);
//        c.setName("Matketing");
//        ProductUtils.insert(c);

//            Product p = new Product();
//            p.setId(2); 
//            p.setName("Milton"); 
//            p.setQty(20); 
//            p.setUnitPrice(100); 
//            p.setTotalproce(2000); 
//            p.setPruchaseDate(new Date()); 
//            Catagory c=new Catagory();
//            c.setId(3);
//            p.setCatagory(c);
            
            //ProductUtils.insertProduct(p);  
            
            
             Service s = new Service();
            s.setSid(1); 
            s.setName("Hasan"); 
            s.setUnitPrice(100); 
            s.setTotalproce(2000); 
            s.setPruchaseDate(new Date()); 
            
            Catagory c=new Catagory();
            //List<Catagory> c = new ArrayList<>();
            c.setId(3);
            s.setCatagory(c);
            
            Product p=new Product();
            p.setId(1); 
            s.setProduct(p);
            
            ProductUtils.insertPractice(s);
            

    }
    
}
