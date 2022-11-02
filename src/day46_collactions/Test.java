package day46_collactions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[4];
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(6);
        Set<Integer> set = new HashSet<>();
        set.add(6);
        set.add(6);
        System.out.println(set);
        System.out.println(list);

    }
}
