package day31_arrayList;

import java.util.ArrayList;

public class AddMethods {
    public static void main(String[] args) {
        ArrayList<Character> letters = new ArrayList<>(); // create an empty arrayList
        System.out.println(letters.size());// 0 -> empty
        letters.add('j');
        letters.add('a');
        letters.add('v');
        letters.add('a');
        System.out.println(letters.size());// number of elements = 4
        System.out.println(letters);

        System.out.println("================================");
        // reading elements from arrayList
        System.out.println(letters.get(0));
        System.out.println(letters.get(1));
        System.out.println(letters.get(2));
        System.out.println(letters.get(3));

        letters.add(0, '$');
        System.out.println(letters);
        System.out.println(letters.get(1));

        letters.add(3, '8');
        System.out.println(letters);

        System.out.println("================================");
    }
}
