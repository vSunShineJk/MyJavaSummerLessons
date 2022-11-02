package Draft.Replit.Loops;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String countY = scan.nextLine();
        // another solution: 7 - 5 = 2/2 = 1
        System.out.println((countY.length() - countY.replace("hi", "").length())/2);


        int y = 0;
        for (int i = 0; i < countY.length()-1; i++){
            if (countY.substring(i,i+2).equals("hi")){
                y++;
            }
        }
        System.out.println(y);
    }
}
