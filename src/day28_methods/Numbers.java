package day28_methods;

import java.util.Scanner;

public class Numbers {
    /*
    Create a method that wil accept a number. Fin and print if it is a positive number,
    negative number or zero
     */

    public static void CheckNum(int n){
        if (n > 0){
            System.out.println("Positive");
        } else if (n < 0){
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        CheckNum(51);
        CheckNum(0);
        CheckNum(-14);

        Scanner input = new Scanner(System.in);
        CheckNum(input.nextInt());

        int n = - 3;
        CheckNum(n);
    }
}
