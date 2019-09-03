package stolov;

public class Main {public static final int PEOPLECOUT = 20;
    public static final int STOLSIZE = 3;

    public static void main(String[] args) {
        Stol stol = new Stol(STOLSIZE);
        // Random rand = new Random();

        for (int i = 0; i < PEOPLECOUT; i++) {
            (new People(i, stol)).start();
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}