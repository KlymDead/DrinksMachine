package Machine2.lesson12.drink;

import Machine2.lesson12.DrinkName;

public class Sprite extends Drink {

    private Type type;

    public Sprite(int price, Type type) {
        super(DrinkName.SPRITE, price);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public enum Type {
        ORIGINAL,
        CUCUMBER,
        LEMON
    }

}
