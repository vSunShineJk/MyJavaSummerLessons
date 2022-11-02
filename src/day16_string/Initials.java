package day16_string;
import java.util.Locale;
import java.util.Scanner;
public class Initials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();

        String initials = "" + firstName.charAt(0) + lastName.charAt(0);
        System.out.println("First name " + firstName);
        System.out.println("Last name " + lastName);
        System.out.println(initials.toUpperCase());
    }
}
