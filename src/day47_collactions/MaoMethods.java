package day47_collactions;

import java.util.HashMap;
import java.util.Map;

public class MaoMethods {
    public static void main(String[] args) {

        Map<Character, Integer> gradeScale = new HashMap<>();
        gradeScale.put('A', 90);
        gradeScale.put('B', 80);
        gradeScale.put('C', 70);
        gradeScale.put('D', 60);
        gradeScale.put('Z', 1000);
        gradeScale.put('Z', 3000); // using put with a key that is already in the map, will update the value

        System.out.println(gradeScale);

        // readying from a map:
        System.out.println(gradeScale.get('B')); // goes to the key and returns that value
        System.out.println(gradeScale.get('b'));

        // removing from a map
        gradeScale.remove('Z');
        System.out.println(gradeScale);

        // contains in a map
        System.out.println(gradeScale.containsKey('C'));
        System.out.println(gradeScale.containsKey('c'));
    }
}
