package day20_loops;

public class MultipleEnd {
    /*
        Multiple End


     */
    public static void main(String[] args) {

        String str = "hello";
        int end = 6;

        for (int i = 0; i < end; i++){
            str += str.charAt(str.length() - 1); // the character at the last index
        }
        System.out.println(str);
    }
}