package Draft.codingBat;

public class StringMatch {
    public static void main(String[] args) {
        String a = "aaxxaaxxaa";
        String b = "iaxxai";

        int len = 0;
        if (a.length() > b.length())len = a.length();
        else len = b.length();

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (a.substring(i,i+2).equals(b.substring(i,i+2))) count++;
        }
        System.out.println(count);
    }
}
