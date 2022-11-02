package Draft.Replit.Loops;

import java.util.Scanner;

public class JavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String JP = scan.nextLine();
        int java = (JP.length() - JP.replace("java", "").length())/4;
        int python = (JP.length() - JP.replace("python", "").length())/6;

        if (java == python){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
