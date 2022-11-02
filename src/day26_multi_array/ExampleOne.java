package day26_multi_array;

public class ExampleOne {
    public static void main(String[] args) {

        char[] upper = {'R' , 'J', 'A'};
        char[] lower = {'p', 'z', 'q', 'e'};
        char[] other = {'4', '#', '*', '$', '&'};

        char[][] chars = new char[3][];
        chars[0] = upper;
        chars[1] = lower;
        chars[2] = other;

        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);

    }
}
