package Draft.Replit.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySimple {
    public static void main(String[] args) {
        String text = new String("abc");

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        // these are the classes and objects


        // 1 intiz
        int[] arr = new int[2]; // 2 -> it means that arr can have only two value

        System.out.println(Arrays.toString(arr));

        arr[0] = 23;
        arr[1] = 1;
//        arr[2] = 12; this will throw ArrayIndexOutOfBoundsException

        System.out.println(Arrays.toString(arr));

        // 2 intiz
        int[] arr2 = {1,4,6,23};
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[3]);
        // System.out.println(arr[100]); this will throw ArrayIndexOutOfBoundsException

        // 3 intiz
        int[] arr3 = new int[] {1,2,3,4,5,6};

        String[] strs = new String[4];


        // int[] arr = {1,2,3};
        // output --> int[] o = {1,2,3,0,0,0}
    }
}
