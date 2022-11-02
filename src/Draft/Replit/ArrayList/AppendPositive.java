package Draft.Replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AppendPositive {
    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();

        int sum = 0;
        for (Integer each : list) {
            if (each > 0){
                newList.add(each);
                sum += each;
            }
        }
        newList.add(sum);
        return  newList;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));
    }
}
