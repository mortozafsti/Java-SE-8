
package xmls;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DOMCreateXMLDemo {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            
            //root Element
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Company");
            
            //staff Element
            Element staff = doc.createElement("staff");
            rootElement.appendChild(staff);
            
            // set attribute to staff element
            Attr atr = doc.createAttribute("id");
            atr.setValue("1");
            staff.setAttributeNode(atr);
            
            staff.setAttribute("id", "1");
            
            
        } catch (Exception e) {
        }
    }
}
