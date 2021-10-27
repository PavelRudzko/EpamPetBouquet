package Data;

import java.util.Objects;

public class Flowers implements IFlower {

    int size ;
    String color;
    double price;
    int termOfStorage;

    public Flowers( int size, String color, double price, int termOfStorage) {

        this.size = size;
        this.color = color;
        this.price = price;
        this.termOfStorage = termOfStorage;
    }


@Override
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTermOfStorage() {
        return termOfStorage;
    }

    public void setTermOfStorage(int termOfStorage) {
        this.termOfStorage = termOfStorage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flowers)) return false;
        Flowers flowers = (Flowers) o;
        return getSize() == flowers.getSize() && Double.compare(flowers.getPrice(), getPrice()) == 0 && Objects.equals(getColor(), flowers.getColor()) && Objects.equals(getTermOfStorage(), flowers.getTermOfStorage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSize(), getColor(), getPrice(), getTermOfStorage());
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "size=" + size +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", termOfStorage='" + termOfStorage + '\'' +
                '}';
    }
}

