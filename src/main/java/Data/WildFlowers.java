package FlowersShop.src.main.java.Data;

public class WildFlowers extends Flowers {
    int quantityInStem;

    public WildFlowers(int size, String color, double price, int termOfStorage, int quantityInStem) {
        super(size, color, price, termOfStorage);
        this.quantityInStem = quantityInStem;
    }
}
