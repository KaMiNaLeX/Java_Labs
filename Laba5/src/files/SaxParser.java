package files;

import by.basil.one.Shturmovik;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;//библотека для саксирования

public class SaxParser extends DefaultHandler {

    Shturmovik R48 = new  Shturmovik();
    String thisElement = "";

    @Override
    public void startDocument() throws SAXException {
        System.out.println("----> Start parse XML...");
    }
/*Обычно SAX-парсеры требуют фиксированного количества памяти для своей работы, но не позволяют изменять
 содержимое документа. Всё, что делает SAX-парсер, это сообщает вызвавшему приложению о встреченных распознанных
  элементах XML-разметки или о встреченных ошибках. Связь парсера с вызывающим приложением, как правило,
  осуществляется посредством функций обратного вызова.*/
    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException {
        thisElement = qName;
    }

    public Shturmovik getResult()
    {
        return R48;
    }

   @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (thisElement.equals("Name")) {
            R48.Name = new String(ch, start, length);
        }
       else if (thisElement.equals("salary")) {
            R48.salary = new Integer(new String(ch, start, length));
        }
       else if (thisElement.equals("level")) {
            R48.level = new String(ch, start, length);
        }
       else if (thisElement.equals("timenaliota")) {
            R48.timenaliota = new Integer(new String(ch, start, length));
        }
       else if (thisElement.equals("oil")) {
            R48.oil = new String(ch, start, length);
        }

    }

    @Override
    public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
        thisElement = "";
    }

    @Override
    public void endDocument() {
        System.out.println("----> Stop parse XML...");
    }
}
