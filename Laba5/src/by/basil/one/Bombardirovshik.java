package by.basil.one;


public class Bombardirovshik extends Military {
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
        if (this.timenaliota> 1000) {
            this.salary +=200;
        }
        return this.salary;
    }

    @Override
    public String toString() {
        return "  Bombardirovshik  {}";
    }

}
