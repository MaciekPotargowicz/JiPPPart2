public class CashMachine implements Processor {

    @Override
    public void printMenu() {
        System.out.println("Dostępne steki:");
    }

    @Override
    public void calculate(int x, Flavour flavour) {

        if (x>=flavour.getPrice()){
            System.out.println("Reszta wynosi: " + (x - flavour.getPrice()) );
        }else {
            System.out.println("Zabrakło: " + (x - flavour.getPrice()) );
        }
    }
}
