
import Data.IFlower;

import java.util.ArrayList;
import java.util.List;

public class BouquetCollection {
    private boolean isWrapped = false;
    private boolean isBoxed = false;
    private boolean isTaped = false;

    private ArrayList<IFlower> bouquetList = new ArrayList<IFlower>();

    public void addFlower(IFlower flower) {
        bouquetList.add(flower);
    }

    public void addAccessories() {
    }
    public void addWrapp(){
        this.isWrapped = true;
    }
    public void removeWrapp(){
        this.isWrapped = false;
    }
    public void addBox(){
        this.isBoxed = true;
    }
    public void removeBox(){
        this.isBoxed = false;
    }
    public void addTape(){
        this.isTaped = true;
    }
    public void removeTape(){
        this.isTaped = false;
    }

    public List<IFlower> getSortedByCost(){
        //bouquetList.so
        return null;
    }

    public double getCost(){
        double sumPrice = 0;
        for (IFlower flower:bouquetList) {
            System.out.println(flower.getClass().getSimpleName() + " - price:" + flower.getPrice());
            sumPrice += flower.getPrice();
        }
        if (this.isBoxed) sumPrice += 2;
        if (this.isWrapped) sumPrice += 1.1;
        if (this.isTaped) sumPrice += 2;

        return sumPrice;
    }



    public List<IFlower> getFlowers() {
        return bouquetList;
    }
}

