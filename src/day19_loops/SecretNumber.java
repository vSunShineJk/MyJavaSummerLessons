package day19_loops;

import java.util.Scanner;

public class SecretNumber {
    public static void main(String[] args) {
        int secretNumber = 87;
        int inputNumber;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Guess a number");
            inputNumber = input.nextInt();

            if (inputNumber < secretNumber){
                System.out.println("Secret number is higher");
            } else if (inputNumber > secretNumber) {
                System.out.println("Secret number is lower");
            }

        } while (secretNumber != inputNumber);

        System.out.println("You guessed the number");
    }
}
