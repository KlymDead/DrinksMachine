import java.util.Arrays;
import java.util.Scanner;


public class Main{

    static int totalPrice = 0;
    static int totalDrinks = 0;

    public static void main(String[] args) {
        runApp();
        System.out.println("totalDrinks: " + totalDrinks);
        System.out.println("totalPrice: " + totalPrice);
    }

    static void runApp() {
        Scanner scanner = new Scanner(System.in);
        Drinks drinks = new Drinks();
        do {
            DrinksMachine drinksMachine = null;
            System.out.println("Please choose a drink : ");
            System.out.println(Arrays.toString(DrinksMachine.values()));
            while (true) {
                String drinksChoice = scanner.nextLine();

                for (DrinksMachine value : DrinksMachine.values()) {
                    if (value.getDrinksChoice().equals(drinksChoice.toUpperCase())) {
                        drinksMachine = DrinksMachine.valueOf(drinksChoice.toUpperCase());
                        break;
                    }
                }
                if (drinksMachine == null) {
                    if (drinksChoice.equals("stop")) {
                        return;
                    }
                    System.out.println("WE DON'T HAVE THIS BROTHA!");
                } else {
                    break;
                }
            }
            int drinkNumber = -1;
            while (true) {
                System.out.println("Enter number of drinks : ");
                if (scanner.hasNextInt()) {
                    drinkNumber = scanner.nextInt();
                    scanner.nextLine();
                    break;
                } else {
                    if (scanner.nextLine().equals("Stop")) {
                        return;
                    } else {
                        System.out.println("Wrong!");
                    }
                }
            }

            switch (drinksMachine) {

                case COFFEE: {
                    System.out.println("Your choose: " + drinksMachine.getDrinksChoice()
                            + "; price: " + drinks.getCoffeePrice() + " number of drinks :" + drinkNumber);
                    totalPrice += checkPrice(drinksMachine, drinks, drinkNumber);
                    break;
                }
                case TEA: {
                    System.out.println("Your choose: " + drinksMachine.getDrinksChoice()
                            + "; price: " + drinks.getTeaPrice() + " number of drinks :" + drinkNumber);
                    totalPrice += checkPrice(drinksMachine, drinks, drinkNumber);
                    break;
                }
                case LEMONADE: {
                    System.out.println("Your choose: " + drinksMachine.getDrinksChoice()
                            + "; price: " + drinks.getLemonadPrice() + " number of drinks :" + drinkNumber);
                    totalPrice += checkPrice(drinksMachine, drinks, drinkNumber);
                    break;
                }
                case MOJITO: {
                    System.out.println("Your choose: " + drinksMachine.getDrinksChoice()
                            + "; price: " + drinks.getMojitoPrice() + " number of drinks :" + drinkNumber);
                    totalPrice += checkPrice(drinksMachine, drinks, drinkNumber);
                    break;
                }
                case MINERAL: {
                    System.out.println("Your choose: " + drinksMachine.getDrinksChoice()
                            + "; price: " + drinks.getMineralPrice() + " number of drinks :" + drinkNumber);
                    totalPrice += checkPrice(drinksMachine, drinks, drinkNumber);
                    break;
                }
                case COLA:
                    System.out.println("Your choose: " + drinksMachine.getDrinksChoice()
                            + "; price: " + drinks.getCocaColaPrice() + " number of drinks :" + drinkNumber);
                    totalPrice += checkPrice(drinksMachine, drinks, drinkNumber);
                    break;
            }
            totalDrinks += drinkNumber;
        } while (true);
    }

    private static int checkPrice(DrinksMachine drinksMachine, Drinks drinks, int drinkNumber) {
        switch (drinksMachine) {
            case COFFEE: {
                return drinkNumber * drinks.getCoffeePrice();
            }
            case TEA: {
                return drinkNumber * drinks.getTeaPrice();
            }
            case LEMONADE: {
                return drinkNumber * drinks.getLemonadPrice();
            }
            case MOJITO: {
                return drinkNumber * drinks.getMojitoPrice();
            }
            case MINERAL: {
                return drinkNumber * drinks.getMineralPrice();
            }
            case COLA: {
                return drinkNumber * drinks.getCocaColaPrice();
            }
            default: {
                return -1;
            }
        }
    }
}