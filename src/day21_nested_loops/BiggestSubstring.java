package day21_nested_loops;

public class BiggestSubstring {
    /*
    Biggest substring of matching characters

    Given a String the biggest substring of char that math and print it

    Ex:
        Input:
            aaaaaaaaabbbbbbcccccccccddddddddddeee
        Output:
            ccccccccc
     */
    public static void main(String[] args) {

        String str = "aaaaaaaaabbbbbbcccccccccddddddddddeee";
        String longest = "";
        String each = "";

        for (int i = 0; i < str.length(); i++){

            each += str.charAt(i); // adds the characters at index i so the String each

            if (str.charAt(i) != str.charAt(i + 1)) { // if the current character is not equal to the next character

                if (each.length() > longest.length()){
                    longest = each;
                }

                each = ""; // resetting for the next part
            }
        }
    }
}
