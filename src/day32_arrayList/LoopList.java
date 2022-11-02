package day32_arrayList;

import java.util.ArrayList;

public class LoopList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(8);
        nums.add(7);
        nums.add(3);
        nums.add(4);
        System.out.println(nums);

        // get(0) get(1) get(2)

        for (int i = 0; i < nums.size(); i++){
            System.out.print(nums.get(i) + " "); // array[i]
        }

        System.out.println();

        for (int each : nums){
            System.out.print(each + " ");
        }
    }
}
