package day20_loops;

public class SpaceProgram {
    /*
        Space program

        Given a String return a version os with space between all of the letters.
        If there is already a space in the String put an underscore.

        Ex: java -> j a v a
            space -> s p a c e
            more words -> m o r e _ w o r d s
     */
    public static void main(String[] args) {

        String s = "java is awesome";
        String result = "";

        for(int i = 0; i < s.length(); i++){ // i <= s.length() -1
            char letter = s.charAt(i);

            if (letter == ' '){
                result += "_ ";
            } else {
                result += letter + " ";
            }
        }

        System.out.println(result.trim());

    }
}
