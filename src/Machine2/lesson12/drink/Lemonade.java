package Machine2.lesson12.drink;

import Machine2.lesson12.DrinkName;

public class Lemonade extends Drink {

    private final Type type;

    public Lemonade(
            int price,
            Type type) {
        super(DrinkName.LEMONADE, price);
        this.type = type;
    }

    public enum Type {
        APPLE,
        ORANGE
    }
}
