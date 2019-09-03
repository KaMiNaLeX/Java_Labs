package by.basil.one;

import by.basil.one.Iiarport.Iiarport;
import org.apache.log4j.Logger;

import java.util.ArrayList;
         public class AirCompany implements Iiarport {
    private static final Logger LOG = Logger.getLogger(Iiarport.class);

    public ArrayList<Military>  aircompany;

    public void AddWorker(Military military) {
        this.aircompany.add(military);
    }
    public Passenger CreatePas() {
        return new Passenger();
    }

    public Bombardirovshik CreateBomb() {
        return new Bombardirovshik();
    }

    public Shturmovik CreateShtur() {
        return new Shturmovik();
    }

    public AirCompany() {
        LOG.info("AirCompany has been created.");
        System.out.println("AirCompany has been created.");
        aircompany = new ArrayList<Military>();
    }


}
