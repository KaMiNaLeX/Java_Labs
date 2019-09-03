package by.basil.one.main;
import by.basil.one.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.log4j.Logger;
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

    }

}
