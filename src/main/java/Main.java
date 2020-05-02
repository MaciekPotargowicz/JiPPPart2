import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Processor processor = new CashMachine();
        Scanner scanner = new Scanner(System.in);
        processor.printMenu();

        for (Flavour flavour: Flavour.values()
             ) {
            System.out.println(Flavour.valueOf(flavour.name()) +": " + flavour.getName() + " Cena: " + flavour.getPrice());
        }
        System.out.println("Zapłać");
        int entered = scanner.nextInt();
        System.out.println("Wprowadź nazwę");
        Flavour flavour = Flavour.valueOf(scanner.next());

        processor.calculate(entered,flavour);

    }
}
