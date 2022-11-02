package day29_methods;

public class FrequencyOfCharacters {
    /*
        Given a String and a char determine how many times the given char is found in the String
        "java"
        a
        > 2
     */
    public static int frequencyOfChar(String str, char letter){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(frequencyOfChar("java", 'a'));
        System.out.println(frequencyOfChar("apple-pie", 'p'));
        System.out.println(frequencyOfChar("non-function", 'n'));
        System.out.println(frequencyOfChar("song", 'a'));
    }
}
