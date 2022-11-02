package Draft.Replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class PolarBearNanuk {
    public static boolean hunt(ArrayList<String> result, int wayStones, int boast) {
        int numOfNanuk = 0;
        int numOfBoast = 0;

        for (String each : result) {
            if (each.equals("nanuk")) numOfNanuk+=1;
            else numOfBoast += Integer.parseInt(each);
        }
        return (wayStones >= numOfNanuk && numOfBoast >= boast);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int stones = in.nextInt();
        int boast = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(hunt(list, stones, boast));
    }
}
