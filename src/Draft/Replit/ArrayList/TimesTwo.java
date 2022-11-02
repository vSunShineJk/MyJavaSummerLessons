package Draft.Replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TimesTwo {
    public static ArrayList<Integer> timesTwo(ArrayList<Integer> nums){

        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) newList.add(i, nums.get(i)+nums.get(i));
        return newList;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(timesTwo(list));
    }
}
