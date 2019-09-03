package files;

import by.basil.one.Enum.AircraftofMonth;
import by.basil.one.Shturmovik;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class DOMparser {

    public List<Shturmovik> shturmoviks;

    public void startParser(String filepath) throws Exception {
        File xmlFile = new File(filepath);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder  builder = factory.newDocumentBuilder();
            Document document = builder.parse(xmlFile);
            document.getDocumentElement().normalize();
            NodeList nodeList = document.getElementsByTagName("Shturmovik");

            shturmoviks = new ArrayList<Shturmovik>();
            for (int i = 0; i < nodeList.getLength(); i++) {
                shturmoviks.add(getOil(nodeList.item(i)));
            }
        }
        catch (Exception exc) {
            exc.printStackTrace();
        }
    }

    public static Shturmovik getOil(Node node) {
        Shturmovik R48 = new Shturmovik();
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            R48.Name = getTagValue("Name", element);
            R48.salary = Integer.parseInt(getTagValue("salary", element));
            R48.timenaliota = Integer.parseInt(getTagValue("timenaliota", element));
            R48.AircraftOfMonth = AircraftofMonth.valueOf(getTagValue("AircraftOfMonth", element));
            R48.level = getTagValue("level", element);
            R48.oil = getTagValue("oil", element);
        }
        return R48;
    }

    public static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = nodeList.item(0);
        return node.getNodeValue();
    }

}

