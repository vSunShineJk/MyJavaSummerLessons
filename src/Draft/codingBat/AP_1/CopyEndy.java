package Draft.codingBat.AP_1;

import java.util.Arrays;

public class CopyEndy {
    public int[] copyEndy(int[] nums, int count) {

        int[] arr = new int[count];

        for (int i = 0, j = 0; i < nums.length && j < count; i++) {
            if (isEndy(nums[i])){
                arr[j] = nums[i];
                j++;
            }
        }

        return arr;
    }

    public boolean isEndy(int n){
        boolean endy = false;
        if ((n >= 0 && n <= 10) || (n >= 90 && n <= 100)) endy = true;
        return endy;
    }

    public static void main(String[] args) {
        CopyEndy obj = new CopyEndy();

        System.out.println(Arrays.toString(obj.copyEndy(new int[]{9, 11, 90, 22, 6}, 3)));
    }
}
