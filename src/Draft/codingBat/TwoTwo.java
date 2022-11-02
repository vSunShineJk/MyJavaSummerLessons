package Draft.codingBat;

public class TwoTwo {
    public static void main(String[] args) {
        int[] nums = {2, 2, 7, 2, 1};
        boolean isTwo = false;
        int count = 0;

        if (nums.length < 2) isTwo = false;
        else {
            for (int num : nums) {
                if (num == 2) {
                    count++;
                    if (count == 2) {
                        count = 0;
                        isTwo = true;
                    } else isTwo = false;
                }
            }
        }

        System.out.println(isTwo);
    }
}
