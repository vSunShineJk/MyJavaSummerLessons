package day51_stream;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Recap {
    public static void main(String[] args) {

        BiPredicate<int[], int[]> arrayEquals = (arr1, arr2) -> {
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        };

        System.out.println(arrayEquals.test(new int[]{1, 2, 3}, new int[]{3, 2, 1}));

        System.out.println("--------------------------------------------------------");

        BiFunction<String, String,String> commonChars = (str1, str2) -> {
            String common = "";
            for (int i = 0; i < str1.length(); i++) {
                if (!common.contains(str1.substring(i,i+1)) && str2.contains(str1.substring(i,i+1))){
                    common += str1.charAt(i);
                }
            }
            return common;
        };
        System.out.println(commonChars.apply("Wooden spoon", "Python"));
    }
}
