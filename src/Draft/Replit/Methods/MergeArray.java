package Draft.Replit.Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static int[] merge(int[] a,int[] b) {
        int[] merge = new int[a.length+b.length];

        for (int i = 0, y = 0; i < merge.length; i++) {
            if (i < a.length) merge[i] = a[i];
             else {
                merge[i] = b[y];
                y++;
             }
        }
        return merge;
    }//end merge


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(merge(nums, nums2)));
    }
}
