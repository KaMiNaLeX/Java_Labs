package by.basil.one.Iiarport;

import by.basil.one.Bombardirovshik;
import by.basil.one.Military;
import by.basil.one.Shturmovik;
import by.basil.one.Passenger;

public interface Iiarport {
    void AddWorker(Military military);
    Passenger CreatePas();
    Shturmovik CreateShtur();
    Bombardirovshik CreateBomb();

}