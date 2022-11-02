package day20_loops;

public class CountCharacters {
    /*
    Give a string, find and print how many uppercase latter lowercase letter, and number are in the String.
    Ex:
        Input:
            2juMp41EEkd4s4
        Output:
            3 uppercase letter
            6 lowercase letters
            5 numbers
     */
    public static void main(String[] args) {

        String s = "2juMp41EEkd4s4";
        int upper = 0, lower = 0, number = 0;

        for (int i = 0; i < s.length(); i++){

            char eachLetter = s.charAt(i);

            if (eachLetter >= 'A' && eachLetter <= 'Z'){
                upper++;
            } else if (eachLetter >= 'a' && eachLetter <= 'z') {
                lower++;
            } else if (eachLetter >= '0' && eachLetter <= '9') {
                number++;
            }

        }

        System.out.println(upper);
        System.out.println(lower);
        System.out.println(number);
    }
}
