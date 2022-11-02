package day28_methods;

public class CharMethods {
    /*
    Char a methods
    Print each one in one line
    - make a method that will print all the letters from A to Z
    - make a method that will print all the letters from a to z
    - make a method that will print all the letters from Z to A
    - make a method that will print all the letters from z to a
    - make a method that will print all the numbers from 0 to 9
     */

    public static void getUpperAtoZ(){
        for (char letter = 'A'; letter <= 'Z'; letter++){
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    public static void getLowerAtoZ(){
        for (char letter = 'a'; letter <= 'z'; letter++){
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    public static void getUpperZtoA(){
        for (char letter = 'Z'; letter >= 'A'; letter--){
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    public static void getLowerZtoA(){
        for (char letter = 'z'; letter >= 'a'; letter--){
            System.out.print(letter + " ");
        }
        System.out.println();
    }

    public static void getNumber0to9(){
        for (int number = 0; number <= 9; number++){
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        getUpperAtoZ();
        getLowerAtoZ();
        getUpperZtoA();
        getLowerZtoA();
        getNumber0to9();
    }
}
