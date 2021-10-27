package Commands;

public class PrintMenu implements ICommand{
    @Override
    public void Execute() {
        System.out.println("1 - Show price list ;");
        System.out.println("2 - Add flowers");
        System.out.println("3 -Add packaging");
        System.out.println("4 - Show bouquet info ");
        System.out.println("5 - Show flower in input length range");
        System.out.println("6 - Show bouquet sort by flowers ");
        System.out.println(("8- AutoCollection"));
        System.out.println("0 - Exit");
        System.out.print("Enter command:");
    }
}
