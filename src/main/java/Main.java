public class Main {

    public static void main(String[] args) {

        for (Flavour flavour: Flavour.values()
             ) {
            System.out.println(Flavour.valueOf(flavour.name()) +": " + flavour.getName() + " Cena: " + flavour.getPrice());
        }

    }
}
