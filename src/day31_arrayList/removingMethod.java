package day31_arrayList;

import java.util.ArrayList;

public class removingMethod {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("today");
        words.add("raining");
        words.add("java");
        words.add("flying");
        System.out.println(words);

        System.out.println("===============================");

        System.out.println("USE THE REMOVING BY INDEX");
        words.remove(2); // returns the element that you remove
        System.out.println(words);

        System.out.println(words.remove(0));
        System.out.println(words);

        words.clear(); // delete  the whole ArrayList
        System.out.println(words);

        System.out.println("===============================");

        System.out.println("USE THE REMOVING BY OBJECT");
        words.add("jumping");
        words.add("barn");
        words.add("chicken");
        words.add("cow");
        System.out.println(words);

        words.remove("barn");
        System.out.println(words);

        // the method below returns the boolean
        System.out.println(words.remove("cow"));
        System.out.println(words);

        System.out.println("===============================");
    }
}
