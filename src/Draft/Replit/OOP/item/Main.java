package Draft.Replit.OOP.item;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // DO NOT TOUCH ANY CODE HERE

        Scanner input = new Scanner(System.in);
        Item item = new Item(input.next(), input.nextInt());
        System.out.println(item);


    }
}
