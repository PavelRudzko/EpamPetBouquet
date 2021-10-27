package Data;

import java.util.Date;

public class WildFlowers extends Flowers {
    int quantityInStem;

    public WildFlowers(int size, String color, double price, int termOfStorage, int quantityInStem) {
        super(size, color, price, termOfStorage);
        this.quantityInStem = quantityInStem;
    }
}
