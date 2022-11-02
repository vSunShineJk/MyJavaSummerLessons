package day24_array;

import java.util.Arrays;

public class ArrayStringMethods {
    public static void main(String[] args) {

        String s = "hello world";
        char[] letters = s.toCharArray();
        System.out.println(letters); // String uses array internally, so it prints as String
        System.out.println(Arrays.toString(letters));
        System.out.println(s.length()); // counts the number of characters
        System.out.println(letters.length); // counts the number of elements

        System.out.println(letters[0]);

        for (char eachLetter : s.toCharArray()){ // : letters (
            System.out.println(eachLetter);
        }
        System.out.println();

        String str = "monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        System.out.println(Arrays.toString(str.split(",")));

        for (String eachDay : str.split(",")){
            System.out.println(eachDay);
        }

        String str2 = "Jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sep-Nov-Okt-Dec";
        String[] months = str2.split("-");

        for (String eachMonth : months){
            System.out.println(eachMonth);
        }
    }
}
