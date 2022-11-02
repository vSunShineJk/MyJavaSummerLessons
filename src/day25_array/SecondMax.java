package day25_array;

import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        /*
            [IQ] Second biggest number

            Given n array of numbers. Find and print the second biggest number

         */

        int[] nums = {4,3,1,4,5,2,4,8,4,8};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Max number: " + nums[nums.length - 1]);
        //System.out.println("Second Max: " + nums[nums.length - 2]); this doesn't works because 8 is duplicate, so it gives wrong second max

        int max = nums[nums.length - 1];

        for (int i = nums.length -1 ; i >= 0; i--){ // read the numbers from the end, We sorted so will keep running until find
            // a new number that is not yhe same as the max number
            if (nums[i] != max) {
                System.out.println("Second max: " + nums[i]);
                break;
            }
        }
    }
}
