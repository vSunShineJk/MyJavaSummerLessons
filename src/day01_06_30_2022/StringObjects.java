package day01_06_30_2022;

public class StringObjects {
    public static void main(String[] args) {
        String s = "first"; // String literal, in String pool
        String s2 = new String("second"); // object in the heap
        System.out.println(s == s2); // compares two different objects

        String s3 = new String("first"); //
    }
}
