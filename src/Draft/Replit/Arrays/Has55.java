package Draft.Replit.Arrays;

import java.util.Scanner;

public class Has55 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //1st method
        int[] nums = {1,1,5,2,1};
        boolean b = false;
        for (int i = 0; i < 5; i++) {
            if (nums[i] == 5 && nums[i+1] == 5){
                b = true;
                break;
            }
        }
        System.out.println(b);

        // 2nd
        String s = "";
        for (int each : nums) {
            s+=each;
        }
        // s: "1551"
        System.out.println(s.contains("55"));
    }
}
