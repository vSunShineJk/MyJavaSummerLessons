package Draft.Replit.Loops;

import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the guest's name:");
        String word2 = scan.next();

        for (int i = 0; i < 10; i++) {
            System.out.println("Do you want to enter another guest's name?");

            String word = scan.next();

            if (word.equals("yes")){
                System.out.println("Please enter the guest's name:");

            } else if (word.equals("no")) {
                System.out.println("Guests' list: " + scan.next());
            }
        }

    }
}
