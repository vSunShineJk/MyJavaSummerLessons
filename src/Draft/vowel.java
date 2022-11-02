package Draft;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next();

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'e' || word.charAt(i) == 'u' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'a'){
                System.out.println(word.charAt(i));
            }
        }
    }
}
