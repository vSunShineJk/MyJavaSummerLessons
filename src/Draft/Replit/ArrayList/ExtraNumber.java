package Draft.Replit.ArrayList;

import java.util.Scanner;

public class ExtraNumber {
    public static String extractNum(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) str+=s.charAt(i);
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }
}
