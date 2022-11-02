package Draft.Replit.Methods;

import java.util.Scanner;

public class CountDuplicate {
    public static int getDup(String[] arr) {
        // a d a a a d -> adaaad
        String dup = "";
        String all = "";

        for (String each : arr) {
            all += each;
        }

        for (String each : arr) {
            int l = ((all.length() - all.replace(each,"").length()))/each.length();
            dup += l;
        }
        // 424442
        // 21222

        int f = 0;
        for (int i = 0; i < dup.length(); i++) {
            String str = dup.substring(i,i+1);
            if (!str.equals("1")){
                f = (dup.length() - dup.replace(str, "").length());
            }
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] strs = new String[in.nextInt()];
        for(int i=0; i < strs.length; i++) {
            strs[i] = in.next();
        }

        System.out.println(getDup(strs));
    }
}
