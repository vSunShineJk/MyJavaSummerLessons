package day01_06_30_2022;

public class Quiz {
    public static void main(String[] args) {
        System.out.println("1)Select the primitive datatype");
        System.out.println("a) String");
        System.out.println("b) int");
        System.out.println("c) main");

        char option = 'b';

        switch (option){
            case 'b':
                System.out.println("Correct");
                break;
            case 'a':
            case 'c':
                System.out.println("Incorrect");
        }
    }
}
