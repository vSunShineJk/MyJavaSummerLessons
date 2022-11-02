package day48_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataBaseExample {
    public static void main(String[] args) {

        Map<String, String> person1 = new HashMap<>();
        person1.put("First_Name", "James");
        person1.put("Last_Name", "Bond");
        person1.put("Age", "40");
        person1.put("Address", "131 Park drive, London");

        System.out.println("First_Name");

        List<Map<String, String>> allPeople = new ArrayList<>();
        allPeople.add(person1);
        allPeople.add(Map.of("First name", "Anna", "Last_name", "Jones", "Age", "30", "Address", "2322 Tucker ave"));

        System.out.println(allPeople);
        System.out.println(allPeople.get(0));
        System.out.println(allPeople.get(0).get("First_name"));
    }
}
