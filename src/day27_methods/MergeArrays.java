package day27_methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {

        int[][] nums = {
                {10, 20, 30},
                {5, 10, 15},
                {1, 2, 3, 4}
        };
        // int[] a = {10, 20, 30, 5, 10, 15, 1, 2, 3, 4};
        // nums.length == 2
        // nums[0].length + nums[1].length --> better than 6, but still not dynamic
        // to count the total number of elements I will need to loop

        int size = 0;
        for (int[] eachArray : nums){
            size += eachArray.length;
        }
        // the purpose of this loop was to count the total number of elements, which should be the size of the marged array

        int[] merged = new int[size];



        int indexToStore = 0;

        for (int[] eachArray : nums){
            for (int eachNum : eachArray){
                merged[indexToStore++] = eachNum;
//                System.out.println(Arrays.toString(merged));
            }
        }

        System.out.println(Arrays.toString(merged));
    }
}
