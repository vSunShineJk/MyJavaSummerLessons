package day46_collactions;

import java.util.*;

public class ReadFromSet {
    public static <set3> void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(5);
        set.add(12);
        set.add(34);
        set.add(-1);
        set.add(9);
        System.out.println(set);

        for (int each : set){
            if (each > 10){
                System.out.println(each);
            }
        }

        Set<String> handles = new HashSet<>();
        handles.add("dead21141124");
        handles.add("jojpo8798757");

        for (String each : handles){
            if (!each.equalsIgnoreCase("dead21141124")){
                // switch to the other handle
            }
        }

        Set<String> set3 = new HashSet<>();
        set3.add("hello");
        set3.add("bye");
        set3.add("java");
        set3.add("world");
        System.out.println(set3);

        List<String> list = new ArrayList<>(set3);
        System.out.println(list);
        System.out.println(list.get(0));

        // Remove duplicate occurrences of each character
        String s = "AAAABBBBCCCCDDD";
        System.out.println(new LinkedHashSet<>(new ArrayList<>(Arrays.asList(s.split(""))))
                .toString().replace(", ", "").replace("[", "").replace("]", "")
        );
    }
}
