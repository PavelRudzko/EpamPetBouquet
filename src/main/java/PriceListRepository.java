import Data.*;
import org.apache.poi.ss.formula.functions.T;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PriceListRepository {

    ArrayList<PriceElement> price = new ArrayList<>();

    public PriceListRepository() {
        ExcelReader reader = new ExcelReader();
        try {
            price = reader.readExcel();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<PriceElement> getPriceList() {
        return price;
    }

    public IFlower getFlowerByIndex(int index) {
        PriceElement element = price.get(index);
        String sort = element.sort;
        IFlower flower;
        switch (sort) {
            case "Rose" -> {
                flower = new Rose(element.size, element.color, element.price, 12);

            }
            case "Tulip" -> {
                flower = new Tulip(element.size, element.color, element.price, 7);

            }
            case "Orchide " -> {

                flower = new Orchide(element.size, element.color, 7, 7, "Brazil");

            }
            case "Centaurea" -> {
                flower = new Centaurea(40, "red", 12, 12, "Brazil");

            }
            case "Narcissus" -> {
                flower = new Narcissus(20, "w", 1, 12);

            }
            case "Chamomile" -> {
                flower = new Chamomile(30, "w", 5, 6, 7);

            }


            default -> {
                flower = new Rose(1, "Red", 0, 12);
            }
        }
        return flower;
    }

    public void getFlowersByID() {
    }

    public void getFlowers() {
    }
}


