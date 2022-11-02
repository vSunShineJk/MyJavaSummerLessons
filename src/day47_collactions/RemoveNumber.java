package day47_collactions;

import java.util.*;

public class RemoveNumber {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(4,5,6,7,8,-3,-4,-5,45,-23));
        Iterator<Integer> it = nums.iterator();

        while (it.hasNext()){
            if (it.next()<5){
                it.remove();
            }
        }
        System.out.println(nums);
    }

}
