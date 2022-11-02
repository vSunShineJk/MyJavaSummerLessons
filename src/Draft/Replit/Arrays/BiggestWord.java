package Draft.Replit.Arrays;

import java.util.Scanner;

public class BiggestWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] words = {"aaa", "bbbb", "whasstupppp", "jaaaaavvaaaaaaaaaa"};

        String longest = "";
        for (String v : words) {
            if (longest.length() < v.length())
                longest = v;
        }
        System.out.println(longest);
    }
}
