import Commands.ICommand;

public class ShowPriceListCommand implements ICommand {
    private final PriceListRepository repo;

    public ShowPriceListCommand(PriceListRepository repository){
        repo = repository;
    }

    @Override
    public void Execute() {
        var list = repo.getPriceList();
        for (PriceElement element: list) {
            System.out.print("id: " + list.indexOf(element));
            System.out.print(", name: " + element.sort);
            System.out.println(",color: " + element.color + "   "+ ",Length : "+ element.size +
                    " " + ",Price: "+ element.price+ " "+
                    ",Term of storage: " + element.condition +
                    " from " + element.country);
        }

        System.out.println();
    }
}
