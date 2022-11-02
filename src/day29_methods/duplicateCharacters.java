package day29_methods;

import my_utils.StringUtil;

public class duplicateCharacters {
    public static void main(String[] args) {
        System.out.println(getDuplicateCharacters("AAABCCDEEF"));
    }
    /*
    [IQ] Duplicate characters

    Given a String, find and return the duplicate character. A character is duplicate if it appears more
    than once in the String.

    Ex:
        AAABCCDEEF
    Output: ACE

    -> The characters A C and E are in the String multiple times so they are duplicates
     */

    public static String getDuplicateCharacters(String str){
        String duplicate = "";

        for (int i = 0; i < str.length(); i++){
            // str.charAT(i) --> give every character

            if (duplicate.contains("" + str.charAt(i))){
                continue;
            }

            int frequency = StringUtil.frequencyOfChar(str, str.charAt(i));

            if (frequency > 1){
                duplicate += str.charAt(i);
            }
        }
        return duplicate;
    }
}
