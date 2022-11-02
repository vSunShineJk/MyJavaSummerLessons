package day17_string;

public class MiddleChar {
    public static void main(String[] args) {

        String str = "water";
        //            01234
        //          length 5/2 = 2

        // elevators length 9/2 = 4
        // 012345678

        if (str.length() % 2 == 1){
            // str has an odd number of characters, so 1 middle char
            int midIndex = str.length()/2;
            System.out.println("The middle character: " + str.charAt(midIndex));
        } else {
            // str has an even number of characters, so 2 middle char

            // elephant   length 8/2 = 4
            // 01234567
            int first = str.length()/2 - 1;
            int second = str.length()/2;
            System.out.println("The middle characters are " + str.charAt(first) + str.charAt(second));
            System.out.println("The middle characters are " + str.substring(first, second + 1));
        }

    }
}
