package Draft.Replit.Methods;

import java.util.Scanner;

public class CountWord {
    public static int wordCount(String words) {
        // your code
        String words2 = words.replace(" ", "");
        return (words.length() - words2.length()) + 1;

        /*
        return words.split(" ").length;
         */
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
