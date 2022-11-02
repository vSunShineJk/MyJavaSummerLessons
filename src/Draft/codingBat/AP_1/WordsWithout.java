package Draft.codingBat.AP_1;

import java.util.ArrayList;
import java.util.Arrays;

public class WordsWithout {
    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "a"};
        String target = "a";

        ArrayList<String> newStr = new ArrayList<>();

        for (String each : words) {
            if (!each.equals(target)) newStr.add(each);
        }

        String[] WordsArr = new String[newStr.size()];
        for (int i = 0; i < WordsArr.length; i++) {
            WordsArr[i] = newStr.get(i);
        }

        System.out.println(Arrays.toString(WordsArr));
    }
}
