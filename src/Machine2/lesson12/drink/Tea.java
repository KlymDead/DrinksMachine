package Machine2.lesson12.drink;

import Machine2.lesson12.DrinkName;

public class Tea extends Drink {

    private final Type type;

    public Tea(int price, Type type) {
        super(DrinkName.TEA, price);
        this.type = type;
    }

    public Type getType() {
        return type;
    }


    public enum Type {
        BLACK,
        GREEN,
        WHITE,
        FRUIT
    }
}
