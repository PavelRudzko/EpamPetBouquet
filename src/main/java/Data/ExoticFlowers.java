package Data;

import java.util.Date;

public class ExoticFlowers extends Flowers {
    String country;

    public ExoticFlowers(int size, String color, double price, int termOfStorage, String country) {
        super(size, color, price, termOfStorage);
        this.country = country;
    }
}
