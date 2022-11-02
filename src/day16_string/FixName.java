package day16_string;
import java.util.Scanner;
public class FixName {
    /*
        ask the user to enter their first name
        ask the user to enter their last name

        point both names in proper format

        uppercase first letter + everything lowercase
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name:");
        String firstName = scan.next();
        System.out.println("Enter your last name:");
        String lastName = scan.next();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);

        System.out.println(firstName);
        System.out.println(lastName);
    }
}
