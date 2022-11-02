package day48_map;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        /*
            apple
            a - 1
            p - 2
            l - 1
            e - 1
         */
        String str = "java";
        Map<Character, Integer> counter = new HashMap<>();

        /*
            map:
                a - 1
                p - 1
         */

        for (int i = 0; i < str.length(); i++) {

            char Key = str.charAt(i);

            if (counter.containsKey(Key)){
                counter.put(Key, counter.get(Key) + 1); // get method will read the current value, then it adds 1 to the value, so the new value after adding ane gat stored as the new value for the same key which is basically reassigning the value for that key
            } else {
                // this is the first time seeing the character, it is not in the map yet
                counter.put(Key, 1);
            }
        }
        System.out.println(counter);
    }
}
