package Draft.codingBat;

import java.util.Arrays;

public class fix23 {
    /*
        Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
        fix23([1, 2, 3]) → [1, 2, 0]
        fix23([2, 3, 5]) → [2, 0, 5]
        fix23([1, 2, 1]) → [1, 2, 1]
     */
//    public int[] fix23(int[] nums){
//
//    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int[] nums2 = new int[3];
        // output: [1,2,0]
        String str = Arrays.toString(nums).replace(", ","");
            if (str.contains("23")){
                for (int i = 0; i < 3; i++) {
                    if (str.charAt(i) == '3') nums2[i] = 0;
                    else nums2[i] = nums[i];
                }
            }
        System.out.println(Arrays.toString(nums2));
    }
}
