package Draft.Replit.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class MaxElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        // 1st method
            int max = 0;
            for (int each : nums){
                if (each > max){
                    max = each;
                }
            }

            System.out.println(max);

        // 2nd method
        System.out.println("before sorting: " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("After sorting: " + Arrays.toString(nums));
        System.out.println(nums[nums.length-1]);
    }
}
