import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Test01 {
    public static void main(String[] args) {
        Queue<Integer> qu = new ConcurrentLinkedQueue<>();
        qu.add(2);
        qu.add(3);
        qu.add(5);
        qu.add(7);
        qu.poll();
        qu.poll();
        Integer s = qu.peek();
        System.out.println(qu);
        System.out.println(s);

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(2);
        Set<Integer> set = new HashSet<>();
        set.add(2);
        set.add(2);
        System.out.println(list);
        System.out.println(set);
        Set<Integer> set2 = new LinkedHashSet<>();


        }
}
