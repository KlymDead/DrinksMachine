import lesson12.DrinkMachine;
import lesson12.DrinkManager;
import lesson12.drink.Drink;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        DrinkManager drinkManager = new DrinkManager(new DrinkMachine());



        Drink[] drinks = drinkManager.orderDrink();
        System.out.println("you have ordered drinks: " + Arrays.toString(drinks));

    }
}
