package Draft.Replit.Methods;

import java.util.Scanner;
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){

            String str1 = "";
            for (int i = 0; i < str.length(); i++) {
                int c = str.length() - str.replace("" + str.charAt(i), "").length();
                str1   += "" + c + str.charAt(i);
            }

            String str2 = "";
            for (int i = 0; i <= str1.length()-2; i+=2) {
                String str3 = str1.substring(i,i+2);
                if (!str2.contains(str3)) str2+=str3;
            }
            return str2;
    }


}
