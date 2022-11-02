package day39_inheritance.Food;

import java.util.Scanner;

public class Mall {
    public static void main(String[] args) {

        System.out.println("----------------------------------");

        Pizza pizza1 = new Pizza("medium", 2);
        System.out.println(pizza1);

        System.out.println("----------------------------------");

        Pizza pizza2 = new Pizza("large", -3);
        System.out.println(pizza2.getSize());
        System.out.println(pizza2.getNumberOfToppings());

        System.out.println("----------------------------------");

        Pizza pizza3 = new Pizza("extra large", 3);
        System.out.println(pizza3.getSize());
        System.out.println(pizza3.getNumberOfToppings());

        pizza3.setSize("large");
        System.out.println(pizza3.getSize());

        System.out.println("----------------------------------");

        Pizza[] pizzas = {pizza1, pizza2, pizza3};

        for (Pizza each : pizzas) {
            System.out.println(each.getSize());
        }

        System.out.println("----------------------------------");

        Scanner sc = new Scanner(System.in);
        Pizza order = new Pizza();
        System.out.println("Welcome to the DoDo Pizza!");

        do {
            System.out.println("What size of pizza would you like?");
            order.setSize(sc.next());

            System.out.println("Number of toppings: ");
            order.setNumberOfToppings(sc.nextInt());

            System.out.println("Is this your final order? ");
            System.out.println(order);

            String user = sc.next();
            if (user.equals("yes")) {
                break;
            } else {
                System.out.println("NO??? SO GO TO FUCK! AND DON'T WASTE OUR TIME!!!"); break;
            }
        } while (true);
        System.out.println("This is your price:");
        System.out.println(order.calculatePrice());
        System.out.println("Your pizza will come soon");
    }
}
