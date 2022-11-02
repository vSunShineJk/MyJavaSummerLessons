package Draft.codingBat.AP_1;

public class ScoresIncreasing {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 9, 4, 7};
        boolean isIncreasing = false;

        for (int i = 0, y = 1; i < nums.length && y < nums.length; i++, y++) {
            if (nums[i] <= nums[y]) isIncreasing = true;
            else {
                isIncreasing = false;
                break;
            }
        }
        System.out.println(isIncreasing);
    }
}
