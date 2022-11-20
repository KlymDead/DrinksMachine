package Machine2.lesson12;

import lesson12.drink.*;

import java.util.Objects;
import java.util.Scanner;

public class DrinkManager {

    private final DrinkMachine drinkMachine;
    private static final int CAPACITY = 2;

    public DrinkManager(DrinkMachine drinkMachine) {
        this.drinkMachine = drinkMachine;
    }


    public Drink[] orderDrink() {
        int count = 0;
        Drink[] drinks = new Drink[CAPACITY];
        boolean moreOrder = true;

        while (count < CAPACITY && moreOrder) {


            DrinkName drink = toDrinkNameEnum(manageUserInputDrinkType());
            Drink result = null;

            if (Objects.isNull(drink)) {
                System.out.println("no such drink type");
            } else {
                switch (drink) {
                    case TEA -> result = drinkMachine.createTea(Tea.Type.BLACK);
                    case COLA -> result = drinkMachine.createCola(Cola.Type.ORIGINAL);
                    case SPRITE -> result = drinkMachine.createSprite(Sprite.Type.ORIGINAL);
                    case LEMONADE -> result = drinkMachine.createLemonade(Lemonade.Type.ORANGE);
                }
                drinks[count] = result;
                ++count;
                moreOrder = manageUserInputMoreOrder();
            }
        }
        return drinks;
    }

    private DrinkName toDrinkNameEnum(String drinkNameStr) {
        DrinkName[] drinkNames = DrinkName.values();
        drinkNameStr = drinkNameStr.toUpperCase();
        DrinkName drink = null;

        for (DrinkName drinkName : drinkNames) {
            if (drinkName.name().equals(drinkNameStr)) {
                drink = drinkName;
                break;
            }
        }
        return drink;
    }

    private String manageUserInputDrinkType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("choose the drink bro");
        return scanner.nextLine();
    }

    private boolean manageUserInputMoreOrder() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("do you want order more?");
        return scanner.nextBoolean();
    }
}
