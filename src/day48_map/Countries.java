package day48_map;

import java.util.*;

public class Countries {
    public static void main(String[] args) {

        // key - countries - String
        // value = cities - List<String>
        Map<String, List<String>> countries = new HashMap<>();
        countries.put("United States", new ArrayList<>(Arrays.asList("Chicago", "Dallas", "Irvine", "San Diego", "New York", "Philadelphia", "Madison")));

        // ArrayList.asList() --> immutable List
        System.out.println("MAP " + countries);

        countries.get("United States").add("Seattle");
        System.out.println("ARRAYLIST " + countries.get("United States"));
        System.out.println("FIRST CITY " + countries.get("United States").get(0)); // first get s from Map, then second get is from arrayList

        countries.put("Europe", new ArrayList<>(Arrays.asList("London", "Paris", "Rome", "Istanbul", "Berlin", "Madrid")));
        countries.put("Uzbekistan", new ArrayList<>(Arrays.asList("Tashkent", "Samarkand", "Bukhara", "Urgench", "Fergana", "Khiva", "Andijan")));
        countries.put("Kazakhstan", new ArrayList<>(Arrays.asList("Astana", "Almaty", "Ktobe")));

        System.out.println(countries);

        Scanner input = new Scanner(System.in);
        System.out.println("What county are you going to tour " + countries.keySet());
        String county = input.next();

        for (String eachCity : countries.get(county)) { // iterate through each city of a specific country
            System.out.println("Touring... " + eachCity);
        }

        System.out.println();

        for (Map.Entry<String, List<String>> eachEntry : countries.entrySet()){

            for (String eachCiy : eachEntry.getValue()) { // the value of each entry is city

                if (eachCiy.startsWith("A") || eachCiy.endsWith("a")){
                    System.out.println(eachCiy);
                }
            }

        }

    }
}
