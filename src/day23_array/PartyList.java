package day23_array;

import java.util.Arrays;
import java.util.Scanner;

public class PartyList {
    public static void main(String[] args) {
        /*
            we are throwing a party, we want to gather all the name
         */

        Scanner input = new Scanner(System.in);
        System.out.println("How many people are coming to the party?");
        int size = input.nextInt();

        String[] names = new String[size];
        System.out.println(Arrays.toString(names));

        for (int i = 0; i < names.length; i++){
            System.out.println("Enter the number of person " + (i));
            String guest = input.next();
            names[i] = guest; // names[i] = input.next();
        }

        System.out.println("First list coming to the party");
        System.out.println(Arrays.toString(names));

    }
}
