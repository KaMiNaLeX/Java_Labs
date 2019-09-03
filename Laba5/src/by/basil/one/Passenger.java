package by.basil.one;

import org.apache.log4j.Logger;
public class Passenger extends Military {
    private static final Logger LOG = Logger.getLogger(Passenger.class);
    public Passenger() {
        LOG.info("Passenger is in company");

    }
    @Override
    public void Fly() {
        System.out.println("Flying");
    }
    @Override
    public void Scan() {
        System.out.println("Scanning...");
    }
    @Override
    public String ChooseOil(String temp) {
        this.oil = temp;
        return this.oil;
    }
    @Override
    public int MoreSalary() {
        if (this.timenaliota > 1000) {
            this.salary +=500;
        }
        return this.salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passenger passenger = (Passenger) o;

        if (timenaliota != passenger.timenaliota) return false;
        if (Double.compare(passenger.timenaliota, timenaliota) != 0) return false;
        return level != null ? level.equals(passenger.level) : passenger.level == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = salary;
        temp = Double.doubleToLongBits(timenaliota);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (level != null ? level.hashCode() : 0);

        return result;
    }
}
