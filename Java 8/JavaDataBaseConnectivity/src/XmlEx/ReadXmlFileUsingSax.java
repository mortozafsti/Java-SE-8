package XmlEx;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.events.StartElement;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXmlFileUsingSax {

    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser sAXParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {
                boolean bfname = false;
                boolean bsalary = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    System.out.println("Start Element: "+qName);
                    if (qName.equalsIgnoreCase("FULLNAME")) { 
                        bfname = true;
                    }
                    if (qName.equalsIgnoreCase("FULLNAME")) { 
                        bsalary = true;
                    }
                    super.startElement(uri, localName, qName, attributes); //To change body of generated methods, choose Tools | Templates.
                }

            };
        } catch (Exception e) {
        }
    }

}
