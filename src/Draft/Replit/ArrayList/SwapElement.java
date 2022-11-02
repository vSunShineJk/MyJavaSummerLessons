package Draft.Replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SwapElement {
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2) {
        ArrayList<String> arrList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            arrList.add(i,list.get(i));
        }
        arrList.set(pos1,list.get(pos2));
        arrList.set(pos2,list.get(pos1));
        return arrList;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int pos1 = in.nextInt();
        int pos2 = in.nextInt();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(swap(list, pos1, pos2));
    }
}
