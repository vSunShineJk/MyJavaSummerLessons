package Draft.codingBat;

public class has12 {
    public static void main(String[] args) {
        int[] nums = {2, 1, 4, 1, 6};
        boolean has12 = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1){
                while (i<nums.length){
                    if (nums[i]==2){
                        has12 = true;
                        break;
                    }
                    else has12 = false;
                    i++;
                }
            }
        }

        System.out.println(has12);
    }
}
