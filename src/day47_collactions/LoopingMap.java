package day47_collactions;

import java.util.HashMap;
import java.util.Map;

public class LoopingMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
            map.put("january", 1);
            map.put("December", 12);
            map.put("April", 4);

            for (String eachKey : map.keySet()){ // iterates through a Set of keys
                System.out.println("key - " + eachKey);
                System.out.println("value - " + map.get(eachKey));
            }

        System.out.println();

            for (Integer eachValue : map.values()){ // iterates through all value
                System.out.println(eachValue);
            }

        System.out.println();

        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) { // iterates through all the entries
            System.out.println(eachEntry.getKey());
            System.out.println(eachEntry.getValue());
        }
    }
}
