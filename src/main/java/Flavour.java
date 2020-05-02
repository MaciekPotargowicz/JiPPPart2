public enum Flavour {

    WELL_DONE("bardzo dobrze wysmażony",150), MEDIUM_WELL("dobrze wysmażony",150), MEDIUM("średnio wysamożony",150)
    , MEDIUM_RARE("średnio krwisty",150), RARE("krwisty",150), BLUE("bardzo krwisty",150);

    private final String name;
    private final int price;

    Flavour(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
