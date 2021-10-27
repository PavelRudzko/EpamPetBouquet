import Commands.AddFlowerToBouquetCommand;
import Commands.ICommand;
import Commands.PrintMenu;
import Data.IFlower;

import java.io.IOException;
import java.util.*;

class UsersMenu {
    private static final PriceListRepository priceList = new PriceListRepository();
    private static BouquetCollection bouquet = new BouquetCollection();

    private static Dictionary<String, ICommand> commands;

    public static void main(String[] args) {
        initCommands();
        boolean isExit = false;
        do {
            commands.get("menu").Execute();
            Scanner scannerID = new Scanner(System.in);
            int commandKey = scannerID.nextInt();
            switch (commandKey) {
                case 1 -> {
                    commands.get("show").Execute();
                    break;
                }
                case 2 -> {
                    addFlowers();
                    break;
                }
                case 3 -> {
                    addPackaging();
                    break;
                }
                case 4 -> {
                    showBouqetInfo();
                    break;
                }
                case 5-> {
                    sortFlowersByLength();
                    break;
                }
                case 6 -> {
                    sortBouquetByFlowers();
                    break;
                }
                case 7 -> {
                    test();
                    break;
                }
                case 8 -> {
                    initialData();
                    break;
                }
                case 0 -> isExit = true;
            }
        }
        while (!isExit);
    }

    private static void initCommands() {
        commands = new Hashtable<>();
        commands.put("menu", new PrintMenu());
        commands.put("show", new ShowPriceListCommand(priceList));
    }

    private static void addFlowers() {
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        IFlower flower = priceList.getFlowerByIndex(index);
        bouquet.addFlower(flower);

    }

    private static void addPackaging() {
        System.out.println("Add tapes ? : Y/N ");
        Scanner scanner = new Scanner(System.in);
        String tape = scanner.nextLine();
        System.out.println(" Add wrap? : Y/N");
        String wrap = scanner.nextLine();
        System.out.println(" Add wrap? : Y/N");
        String box = scanner.nextLine();

        if (wrap.equals("Y") || wrap.equals("y")){
            System.out.println("Tape");
            bouquet.addTape();
        } else {
            System.out.println("No tape");
        }

        if (wrap.equals("Y") || wrap.equals("y")) {
            System.out.println("Add wrap ");
            bouquet.addWrapp();
        } else {
            System.out.println("No Wrap");
        }

        if (box.equals("Y") || box.equals("y")) {
            System.out.println("Add box ");
            bouquet.addWrapp();
        } else {
            System.out.println("No Wrap");
        }
        if (tape.equals("Y") || tape.equals("y")) {
            System.out.println("Add tapes ");
            bouquet.addWrapp();
        } else {
            System.out.println("No tape");
        }
    }

    public static void sortFlowersByLength(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input minimal size of flower: ");
        int minSize = scanner.nextInt();
        System.out.println(" Input maximal size of flower: ");
        int maxSize = scanner.nextInt();

       for  (IFlower flower : bouquet.getFlowers()){
                int size = flower.getSize();
               if (size >= minSize && size <= maxSize)
               System.out.println(flower);
       }
    }



    public static void sortBouquetByFlowers(){}

    private static void showBouqetInfo() {
        for (IFlower flower:bouquet.getFlowers()) {
            System.out.println(flower.getClass().getSimpleName() + " - price:" + flower.getPrice());
        }
        System.out.println("Bouquet cost is " + bouquet.getCost());
    }

    private static void test() {
        ExcelReader reader = new ExcelReader();
        try
        {
            ArrayList<PriceElement> list = reader.readExcel();
            for (PriceElement el:
                 list) {
                System.out.println(el.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void initialData(){
        bouquet.addFlower(priceList.getFlowerByIndex(2));
        bouquet.addFlower(priceList.getFlowerByIndex(7));
        bouquet.addFlower(priceList.getFlowerByIndex(9));
        bouquet.addFlower(priceList.getFlowerByIndex(12));
        bouquet.addFlower(priceList.getFlowerByIndex(15));
    }
}





