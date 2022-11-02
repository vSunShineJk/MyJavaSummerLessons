package Draft.Replit.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheSentence {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String[] split = sentence.split(" ");

        for (int i = split.length - 1; i >= 0; i--){
            System.out.print(split[i] + " ");
        }
    }
}
