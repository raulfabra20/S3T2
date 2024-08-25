package n1;

import n1.models.*;

import java.util.Scanner;

public class PizzaRestaurant {

    public static void testApp(){
        Scanner sc = new Scanner(System.in);

        boolean exit = false;

        do {
            byte optionPizza = getOption();

            if (optionPizza == 0) {
                System.out.println("Exiting the app. Thank you.");
                exit = true;
            } else {
                String optionSize = getSizePizza();
                String optionDough = getDoughPizza();
                switch (optionPizza) {
                    case 1:
                        PizzaBuilder<Pizza> hawaiianBuilder = new HawaiianPizzaBuilder().setSize(optionSize)
                                .setDough(optionDough);
                        PizzaMaster pizzaMaster = new PizzaMaster(hawaiianBuilder);
                        Pizza hawaiianPizza = pizzaMaster.makePizza();
                        System.out.println("Hawaiian pizza ready: " + hawaiianPizza.toString());
                        break;
                    case 2:
                        PizzaBuilder<Pizza> vegetarianBuilder = new VegetarianPizzaBuilder().setSize(optionSize)
                                .setDough(optionDough);
                        pizzaMaster = new PizzaMaster(vegetarianBuilder);
                        Pizza vegetarianPizza = pizzaMaster.makePizza();
                        System.out.println("Vegetarian pizza ready: " + vegetarianPizza.toString());
                        break;
                    case 3:
                        PizzaBuilder<Pizza> diavoloBuilder = new DiavoloPizzaBuilder().setSize(optionSize)
                                .setDough(optionDough);
                        pizzaMaster = new PizzaMaster(diavoloBuilder);
                        Pizza diavoloPizza = pizzaMaster.makePizza();
                        System.out.println("Diavolo pizza ready: " + diavoloPizza.toString());
                        break;
                    default:
                        throw new IllegalArgumentException("Option not valid");
                }
            }
        } while(!exit);

    }

    public static Byte getOption(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the type of pizza you want to order: " +
                " (1. Hawaiian, 2. Vegetarian, 3. Diavolo)  or 0. for exit the app.");
        byte option = sc.nextByte();
        sc.nextLine();
        return option;
    }

    public static String getSizePizza(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the size of the pizza: (Small, Medium, Familiar)");
        String option = sc.nextLine().toLowerCase();
        return option;
    }

    public static String getDoughPizza(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the dough of the pizza: (Thick, Thin)");
        String option = sc.nextLine().toLowerCase();
        return option;
    }
}
