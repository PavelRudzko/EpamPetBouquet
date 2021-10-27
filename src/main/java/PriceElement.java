import Data.IGoods;

public class PriceElement implements IGoods {
     String sort;
     int size;
     double price;
     int condition;
     String color;
     String country;

    public String getSort()
    {
        return this.sort;
    }
    public void setSort(String sort)
    {
        this.sort = sort;
    }
    public double getPrice()
    {
        return this.price;
    }
    @Override
    public String toString() {
        return "PriceElement{" +
                "sort='" + sort + '\'' +
                ", lenght=" + size +
                ", price=" + price +
                ", condition=" + condition +
                ", color='" + color + '\'' +
                ", country ='" + country + '\'' +
                '}';
    }
}
