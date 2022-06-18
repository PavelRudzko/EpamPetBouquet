package FlowersShop.src.main.java;

import FlowersShop.src.main.java.Data.IGoods;

public class PriceElement implements IGoods {
     public String sort;
     public int size;
     public double price;
     public int condition;
     public String color;
     public String country;

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
