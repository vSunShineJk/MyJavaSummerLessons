package Draft.codingBat.AP_1;

import java.util.Arrays;

public class CopyEvens {
    public static void main(String[] args) {
        int[] nums = {6, 1, 2, 4, 5, 8};
        int count = 3;

        int[] arr = new int[count];

        for (int i = 0, j = 0; i < nums.length && j < count; i++) {
            if (nums[i]%2 == 0){
                arr[j] = nums[i];
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
