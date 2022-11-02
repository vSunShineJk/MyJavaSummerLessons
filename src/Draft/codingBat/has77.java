package Draft.codingBat;

import java.util.Arrays;

public class has77 {
    public static void main(String[] args) {

        int[] nums = {2, 7, 2, 7, 2};

        String str = Arrays.toString(nums).replace(", ","");
        boolean has77 = false;

        if(str.contains("77")) has77 = true;
        else{
            for (int i = 0; i < nums.length; i++) {
                if (nums[i]==7){
                    i+=2;
                    if (nums[i]==7)has77 = true;
                }
            }
        }
        System.out.println(has77);
    }
}
