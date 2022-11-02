package Draft.Replit.OOP.country;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // DO NOT TOUCH ANY CODE HERE

        Scanner input = new Scanner(System.in);
        int test = input.nextInt();
        input.nextLine();
        switch (test) {
            case 1:
                test(new Country(input.nextLine(), input.nextLine()));
                break;
            case 2:
                test(new Country(input.nextLine(), input.nextLine(), input.nextLong()));
                break;
            case 3:
                test(new Country(input.nextLine(), input.nextLine(), input.nextLong(), input.nextBoolean()));
                break;
        }

    }

    public static void test(Country c) {
        System.out.println(c.name);
        System.out.println(c.continent);
        System.out.println(c.population);
        System.out.println(c.nearWater);
    }
}