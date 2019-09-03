package by.basil.one;

public class Shturmovik extends  Military{
//фабричный метод (штурмовки пассажир бомбордировщик)
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
        if (this.timenaliota > 900) {
            this.salary +=300;
        }
        return this.salary;
    }

    public void UpgradeShturmovik (Shturmovik temp) {
        temp.salary+=10;
        temp.timenaliota +=200;
    }




}
