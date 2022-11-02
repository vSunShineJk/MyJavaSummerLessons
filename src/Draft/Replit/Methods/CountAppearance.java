package Draft.Replit.Methods;

import java.util.Scanner;

public class CountAppearance {
    public static int countAppearance(String[] arr, String word){

        String store = "";
        for (String each : arr) {
            store += each;
        }
        System.out.println(store);
        int l = (store.length() - store.replace(word,"").length())/word.length();
        return l;
    } //end  count_appearance

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        String[] strs = new String[in.nextInt()];
        System.out.println("Enter the search word:");
        String word = in.next();
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(countAppearance(strs,word));
    }
}
