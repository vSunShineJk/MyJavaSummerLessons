package day47_collactions;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>(); // maintains insertion order
        // keys are integer
        // values are string

//        map1.add(); there is no method

        map1.put(4, "four");
        map1.put(1, "one");
        map1.put(7, "seven");
        map1.put(10,"ten");
        map1.put(5, "five");
        map1.put(-2, "negative");
        map1.put(null,"empty");

        System.out.println(map1);

        Map<Integer, String> map2 = new TreeMap<>(); // maintains natural order for the keys
        map2.put(4, "four");
        map2.put(1, "one");
        map2.put(7, "seven");
        map2.put(10,"ten");
        map2.put(5, "five");
        map2.put(-41,"negative");
//        map2.put(null, "empty"); null not allowed in TreeMap

        System.out.println(map2);

        Map<Integer, String> map3 = new Hashtable<>(); // random order
        map3.put(4, "four");
        map3.put(1, "one");
        map3.put(7, "seven");
        map3.put(10,"ten");
        map3.put(5, "five");
        map3.put(-41,"negative");
//        map3.put(null, "empty"); not allowed
//        map3.put(7, null); not allowed

        System.out.println(map3);
    }
}
