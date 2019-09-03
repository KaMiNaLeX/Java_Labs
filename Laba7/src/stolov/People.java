package stolov;
import java.util.Random;

public class People extends Thread {

    public String peopleName;
    Stol stol;
    Random random = new Random();

    public People(int pPeopleName, Stol pStol) {
        this.peopleName = String.valueOf(pPeopleName);
        this.stol = pStol;
        System.out.println("Car " + this.peopleName + "  come");
    }
    //Синхронизация это процесс, который позволяет выполнять все параллельные потоки в программе синхронно.
//Синхронизация позволяет избежать ошибок согласованности памяти, вызванные из-за непоследовательного доступа к общей памяти.
    @Override
    public void run() {
        synchronized (stol) {
            if (stol.getFreePlace() == -1) {
                int waitingTime = random.nextInt(1000);
                System.out.println("People " + this.getPeopleName() + " is waiting...");
                try{
                    stol.wait(waitingTime);
                }
                catch(InterruptedException e){
                }
            }
        }
        if(stol.getFreePlace() != -1){
            stol.setPeople(this);
            stol.showStol();
            try{
                Thread.sleep(random.nextInt(3000));
            }
            catch(Exception e){
            }

            stol.leavePeople(this);
            synchronized (stol){
                stol.notify();
            }
        }
        else{
            System.out.println("People " + this.getPeopleName() + " left");
        }
    }

    public String getPeopleName(){
        return this.peopleName;
    }
}
