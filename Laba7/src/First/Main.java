package First;

//import java.util.Random;

public class Main {
    public static final int CARCOUT = 20;
    public static final int PARKINGSIZE = 5;

    public static void main(String[] args) {
        Parking parking = new Parking(PARKINGSIZE);
       // Random rand = new Random();

        for (int i = 0; i < CARCOUT; i++) {
            (new Car(i, parking)).start();
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
//1. наследоваться и создать объект
//2. по умолчанию наши потоки wait-т.е. заморожены; notify все потоки оживит
//3.