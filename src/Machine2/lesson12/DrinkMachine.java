package Machine2.lesson12;

import lesson12.drink.*;

public class DrinkMachine {


    public Drink createCola(Cola.Type type) {

        return new Cola(15, type);
    }

    public Drink createLemonade(Lemonade.Type type) {
        return new Lemonade(7, type);
    }

    public Drink createSprite(Sprite.Type type) {
        return new Sprite(15, type);
    }

    public Drink createTea(Tea.Type type) {
        return new Tea(10, type);
    }


}
