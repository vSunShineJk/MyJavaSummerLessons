package day24_array;

import java.util.Arrays;

public class reverseEachWord {
    public static void main(String[] args) {
        String str = "Today is Friday. Have a good day";

        String [] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        String reverse = "";

        for (String each : words) {
            System.out.println(each);

            String eachReverse = "";
            for (int i = each.length() - 1; i >= 0 ; i--) {
                eachReverse += each.charAt(i);
            }
            System.out.println(eachReverse + " ");

        }
        System.out.println(reverse);


    }
}
