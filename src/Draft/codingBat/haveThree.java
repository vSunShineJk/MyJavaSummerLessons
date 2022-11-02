package Draft.codingBat;

public class haveThree {
    public static void main(String[] args) {

        int[] nums = {3, 4, 3, 4, 3, 4, 4};
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==3){
                i++;
                count++;
            }
        }

        System.out.println(count==3);

    }
}
