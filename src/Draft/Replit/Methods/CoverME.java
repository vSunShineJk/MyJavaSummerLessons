package Draft.Replit.Methods;
import java.util.Scanner;
public class CoverME {
    public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          System.out.println(coverString(in.nextLine(), in.nextLine()));
    }

    public static String coverString(String main, String coverMe) {
        // your code here
        if (main.contains(coverMe)){
            String jjCover = main.replace(coverMe, "[" + coverMe + "]");
            return jjCover;
        } else {
            return "[" + main + "]";
        }
    }
}
