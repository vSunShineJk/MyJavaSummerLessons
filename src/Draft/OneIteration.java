package Draft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OneIteration {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4,6,8,10,3,7));
        ArrayList<Integer> nums2 = new ArrayList<>(nums);
        Collections.sort(nums);
        System.out.println(nums2);

        for (int i = 0; i < nums.get(0); i++) {
            System.out.println(nums2.get(i));
        }
    }
}
