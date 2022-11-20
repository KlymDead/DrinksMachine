package Machine2.lesson12.drink;

import Machine2.lesson12.DrinkName;

public class Cola extends Drink {

    private final Type colaType;

    public Cola(int price, Type type) {
        super(DrinkName.COLA, price);
        this.colaType = type;
    }

    public Type getColaType() {
        return colaType;
    }

    public enum Type {
        ZERO,
        ORIGINAL,
        CHERRY,
        MAX
    }

}
