package day47_collactions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveLength {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>(Arrays.asList("one", "two", "java", "hello", "world", "automation", "fan", "soft skills", "launch"));

        Iterator<String> it = words.iterator();
        while (it.hasNext()){
            if (it.next().length() <= 4){
                it.remove();
            }
        }
        System.out.println(words);
    }
}
