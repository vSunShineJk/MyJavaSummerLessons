package Draft.Replit.Methods;

public class EachCharacter {
    public static void main(String[] args) {
        String str = "aabcccda";

        // 3a1b2c1d

        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i,i+1).equals(str.charAt(i))){

            }
        }


    }
}
