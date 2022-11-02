package day16_string;

public class LongestA {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "mouse";
        String word3 = "computer";
        String longest = "";

        if (word1.contains("a") && word1.length() > longest.length()){
            longest = word1;
        }

        if (word2.contains("a") && word2.length() > longest.length()){
            longest = word2;
        }

        if (word3.contains("a") && word3.length() > longest.length()){
            longest = word3;
        }

        System.out.println(longest + " is the longest");
    }
}
