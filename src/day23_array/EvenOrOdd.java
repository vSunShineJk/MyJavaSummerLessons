package day23_array;

import java.util.Arrays;

public class EvenOrOdd {
    public static void main(String[] args) {

        int[] nums = {3, 5, 12, 12, 5, 12, 4, 2};
        System.out.println(nums);
        int even = 0, odd = 0;

        for (int each: nums){
            if (each % 2 == 0){
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
