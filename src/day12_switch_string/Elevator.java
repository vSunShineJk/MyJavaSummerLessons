package day12_switch_string;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {

//        Scanner = new Scanner(System.in);
        int floor = 2;
        String companies;

        switch (floor) {

            case 1:
                companies = "Lobby, StarBucks, Amazon Pick Up";
                break; // stops the switch
            case 2:
                companies = "NASA, Sydeo, Discovery";
                break;
            case 3:
                companies = "Uber, Lytf, Chase";
                break;
            case 4:
                companies = "Rooftop, Loung";
                break;
            default:
                companies = "Invalid Floor Selected";
        }

        System.out.println("Floor: " + floor + ": " + companies);

    }
}
