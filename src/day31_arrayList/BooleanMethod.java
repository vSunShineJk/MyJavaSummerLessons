package day31_arrayList;

import java.util.ArrayList;

public class BooleanMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("IS EMPTY METHOD");
        System.out.println("is empty: " + list.isEmpty());
        list.add(4);
        list.add(5);
        list.add(41);
        list.add(5512);
        list.add(413);
        System.out.println(list);
        System.out.println("is empty: " + list.isEmpty());

        System.out.println("=======================================");

        System.out.println("CONTAINS METHOD");
        System.out.println("contains 41: " + list.contains(41));
        System.out.println("contains 5000: " + list.contains(5000));
        System.out.println("contains 1: " + list.contains(1));// contains methods check if the given argument is an element in the arrayList
        System.out.println("contains 1: " + list.contains(3));

        System.out.println("=======================================");

        System.out.println("EQUALS METHOD");
        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(4);
        list2.add(5);
        list2.add(41);
        list2.add(5512);
        list2.add(413);
        System.out.println("equals: " + list.equals(list2));// same values
        list2.remove(0);
        System.out.println("equals: " + list.equals(list2));

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(3);
        list4.add(2);
        list4.add(1);

        System.out.println("List3: " + list3);
        System.out.println("List4: " + list4);
        System.out.println(list3.equals(list4));
    }
}
