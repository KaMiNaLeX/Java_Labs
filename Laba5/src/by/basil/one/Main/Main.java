package by.basil.one.Main;
import by.basil.one.AirCompany;
import by.basil.one.Dispetcher;
import by.basil.one.Shturmovik;
import files.SaxParser;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Main {
    static {
        new DOMConfigurator().doConfigure("log/log4j.xml", LogManager.getLoggerRepository());
    }

    private static final Logger LOG = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        LOG.info("Starting program...");
        LOG.isDebugEnabled();
        Dispetcher Bazil =  Dispetcher.getInstance();
        AirCompany BSTU = new AirCompany();
        try {


            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            SaxParser saxp = new SaxParser();
            parser.parse(new File("src/files/Shturmovik.xml"), saxp);
            Shturmovik R48 = saxp.getResult();
            System.out.println(R48.Name);
            System.out.println(R48.salary);
            System.out.println(R48.level);
            System.out.println(R48.timenaliota);
            System.out.println(R48.oil);

/*
            DOMparser domParser = new DOMparser();
            domParser.startParser("src/files/Shturmovik.xml");
            System.out.println(domParser.shturmoviks.get(0).Name);*/
System.out.println("---------------------------------------------------------");
            FileOutputStream out = new FileOutputStream("src/files/Serialize.xml");
            XMLEncoder xmlEncoder = new XMLEncoder(out);
            xmlEncoder.writeObject(R48);
            xmlEncoder.close();
            // DeSerialization
            FileInputStream in = new FileInputStream("src/files/Serialize.xml");
            XMLDecoder xmlDecoder = new XMLDecoder(in);
            Shturmovik R482 = (Shturmovik) xmlDecoder.readObject();
            xmlDecoder.close();
            System.out.println(R482.Name);
            System.out.println(R482.salary);
            System.out.println(R482.level);
            System.out.println(R482.timenaliota);
            System.out.println(R482.oil);

            /*FileWriter out_JSON = new FileWriter("src/file/Serialize.json", true);
            Gson gson = new Gson();
            gson.toJson(R482, out_JSON);
            out_JSON.close();
            FileReader in_JSON = new FileReader("src/files/Serialize.json");
            Shturmovik R48json = gson.fromJson(in_JSON, Shturmovik.class);
            in_JSON.close();*/


        } catch (Exception e) {
            LOG.info(e.getMessage());
        }
        /*
         Bombardirovshik Bomb = BSTU.CreateBomb();
        Bomb.Name = "AMS-31";
        Bomb. timenaliota = 900;
        Bomb.salary = 800;
        Bomb.level = "Hard";
        Bomb.oil = "Soliar";
        Bomb.ChooseOil("Benzin");
        Bomb.Scan();
        System.out.println(Bomb.oil);

        Passenger Pass = BSTU.CreatePas();
        Pass.Name = "BOI-707";
        Pass.timenaliota = 600;
        Pass.level = "Medium";
        Pass.salary = 1700;


        Shturmovik Shtur = BSTU.CreateShtur();
        Shtur.Name = "NVX-200";
        Shtur.timenaliota = 1200;
        Shtur.ChooseOil("Podsolnechnoe");
        Shtur.salary = 2200;
        Shtur.Fly();
        Shtur.level = "Very Hard";
        Shtur.UpgradeShturmovik(Shtur);
        Shtur.MoreSalary();

        BSTU.AddWorker(Bomb);
        BSTU.AddWorker(Pass);
        BSTU.AddWorker(Shtur);
        System.out.println(Bazil.CountofAicraft(BSTU));
        System.out.println(Bazil.Search(BSTU,"Hard"));

        Bazil.SortByTimenaliota(BSTU);
        Bazil.ShowTimenaliota(BSTU);



        try {
            Bombardirovshik  Strong = new   Bombardirovshik ();
            Strong.salary = 441;
            Boolean b = new Boolean(Strong.Name);
            if (Strong.salary < 500)
                throw   new IllegalArgumentException("Illegal Arguments");


        }
        catch (IllegalArgumentException e) {
            System.out.println( e.getLocalizedMessage());
        }
        catch (NullPointerException e){
            LOG.error(e.getLocalizedMessage());
            System.out.println(e.getLocalizedMessage());
        }
        catch (ArithmeticException e) {
            System.out.println(e.getLocalizedMessage());
        }
        finally {
            System.out.println("Threads restarted");
        }

        */
    }

}
