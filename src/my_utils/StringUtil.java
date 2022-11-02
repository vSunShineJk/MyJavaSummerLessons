package my_utils;

public class StringUtil {
    /*
        This class will be used to create String utility method
     */
    public static void main(String[] args) {
        System.out.println(reverse("hello"));
        frequencyOfChar("hello", 'a');
    }

    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }

    // palindrome means the String in the same forward and backwards

    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }

    /*
    Fix format

    create a method will accept a String and return a String in proper format. Proper format is:
    First character starting as uppercase and the rest lowercase
     */

    public static String fixFormat(String str){
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }

    /*
    CAmel case
    create a method that will accept a String, of words separated by space, and return a camel case version of String when the first letter of each word is Uppercase and the rest of the words is lowercase.
    Exception: First word starts with lowercase
     */
    public static String CamelCase(String str){
        String[] allWords = str.split(" ");
        String camelCase = allWords[0].toLowerCase();

        for (int i = 1; i< allWords.length; i++){ // I'm starting from index 1 because I already used first word
            camelCase += fixFormat(allWords[i]);
        }
        return camelCase;
    }

    public static int frequencyOfChar(String str, char letter){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == letter){
                count++;
            }
        }
        return count;
    }
}
