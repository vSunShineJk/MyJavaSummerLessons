package day28_methods;

public class numberToWord {
    /*
    5 -> five
     */
    public static void main(String[] args) {
        System.out.println(numberToWord(1));
        System.out.println(numberToWord2(7));
        System.out.println(numberToWord2(9));

        String str = numberToWord2(5);
    }
    public static String numberToWord(int n){
        String word = "";
        switch (n){
            case 1:
                word = "one";
                break;
            case 2:
                word = "two";
                break;
            case 3:
                word = "three";
                break;
            case 4:
                word = "four";
                break;
            case 5:
                word = "five";
                break;
            case 6:
                word = "six";
                break;
            case 7:
                word = "seven";
                break;
            default:
                word = "invalid. we can only accept number from 1 - 7";
        }
        return word;
    }

    public static String numberToWord2(int n){
        switch (n){
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
        }
        return "invalid.";// at the end or default case is also fine
    }
}
