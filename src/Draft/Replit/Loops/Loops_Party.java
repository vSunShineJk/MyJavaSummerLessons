package Draft.Replit.Loops;

import java.util.Scanner;

public class Loops_Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String db = "";
        do {
            System.out.println("Pleas enter the guest's name");
            String str = input.next();
            db += str + ", ";
            System.out.println("Doy want to enter another guest's name?");
            String answer = input.next();
            if (answer.equals("no")) break;
        } while (true);
        System.out.println("Guests' list: " + db.substring(0, db.length()-2));
    }
}
