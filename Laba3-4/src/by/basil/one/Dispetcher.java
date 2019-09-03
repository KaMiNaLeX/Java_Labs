package by.basil.one;
import org.apache.log4j.Logger;

import java.util.Comparator;

public class Dispetcher {
    private static final Logger LOG = Logger.getLogger(Dispetcher.class);
    private static Dispetcher ourInstance = new Dispetcher();//патерн одиночка(один обхект создается)

    public static Dispetcher getInstance() {
        return ourInstance;
    }//патерн одиночка

    public int CountofAicraft(AirCompany aircompany) {
        return aircompany.aircompany.size();
    }

    public String Search(AirCompany comp, String lvl) {
        int k = 0;
        for (int i = 0; i < comp.aircompany.size(); i++) {
            if (comp.aircompany.get(i).level.equals(lvl))
                k=i;

        }
        return  comp.aircompany.get(k).Name;
    }

    public AirCompany SortByTimenaliota(AirCompany temp) {
        temp.aircompany.sort(new Comparator<Military>() {
            @Override
            public int compare(Military o1, Military o2) {
                if (o1.timenaliota > o2.timenaliota) {
                    return 1;
                }
                if (o1.timenaliota < o2.timenaliota) {
                    return -1;
                }
                return 0;
            }
        });
        return temp;
    }
    public void ShowTimenaliota(AirCompany temp) {//результ сортировки
        for (int i = 0; i < temp.aircompany.size(); i++) {
            System.out.println(temp.aircompany.get(i).Name + " timenaliota:" + temp.aircompany.get(i).timenaliota);
        }
    }

    public Dispetcher() {
        LOG.info("BEHOLD NEW DISPETCHER");//импорт логеор
        System.out.println("BEHOLD NEW DISPETCHER");
    }
}
