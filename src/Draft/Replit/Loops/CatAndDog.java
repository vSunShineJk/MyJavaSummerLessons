package Draft.Replit.Loops;

import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {
        String catDog = new Scanner(System.in).nextLine();

        int c = 0;
        int d = 0;
        for (int i = 0; i < catDog.length()-2; i++){
            if (catDog.substring(i, i+3).equals("cat")){
                c++;
            }

            if (catDog.substring(i, i+3).equals("dog")){
                d++;
            }
        }
        if (c == d){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
     }
}
