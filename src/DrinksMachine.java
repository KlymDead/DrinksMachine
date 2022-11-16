public enum DrinksMachine {
    COFFEE("COFFEE"),
    TEA("TEA"),
    LEMONADE("LEMONADE"),
    MOJITO("MOJITO"),
    MINERAL("MINERAL"),
    COLA("COLA");

    public String drinksChoice;

    DrinksMachine(String drinksChoice) {
        this.drinksChoice = drinksChoice;

    }

    public String getDrinksChoice() {
        return drinksChoice;
    }
}