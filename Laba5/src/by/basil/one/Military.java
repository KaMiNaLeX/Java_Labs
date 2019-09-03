package by.basil.one;
import by.basil.one.Enum.AircraftofMonth;
public abstract class Military {
    public int salary;
    public int timenaliota;
    public String level;
    public String oil;
    public String Name;
    public AircraftofMonth AircraftOfMonth;
    public abstract void Fly();
    public abstract void Scan();
    public abstract String ChooseOil(String temp);
    public abstract int MoreSalary();



}