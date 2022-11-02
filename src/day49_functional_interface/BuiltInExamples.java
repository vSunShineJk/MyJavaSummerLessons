package day49_functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class BuiltInExamples {
    public static void main(String[] args) {

        Predicate<Integer> isPrime = p -> {

            if (p<2)return false;

            for (int i = 2; i < p/2; i++) {
                if (p%i==0){
                    return false;
                }
            }

            return true;

        };

        System.out.println(isPrime.test(7));
        System.out.println(isPrime.test(-8));

        List<Integer>nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        nums.removeIf(isPrime);
        System.out.println(nums);

        nums = new ArrayList<>(Arrays.asList(2,55,67,35,545,3));
        nums.removeIf(p -> p < 10);
        System.out.println(nums);

        System.out.println("---------------------");

        Consumer<int[]> printArray = arr -> {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" - ");
            }
        };

        printArray.accept(new int[]{3, 5, 1, 2, 5});

        System.out.println("---------------------");

        List<String> words = new ArrayList<>(Arrays.asList("java","soft skills","house","shed","garden","emoji","fun"));
        words.forEach(each -> System.out.println(each));

        System.out.println("---------------------");

        words.forEach(each ->{
            System.out.print(""+each.charAt(0)+each.charAt(each.length()-1));
            System.out.println(each.length());
        });

        System.out.println("---------------------");

        words.forEach(each -> System.out.println(each.substring(0,3)));


    }
}
