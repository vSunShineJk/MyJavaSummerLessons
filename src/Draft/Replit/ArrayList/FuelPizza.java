package Draft.Replit.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class FuelPizza {
    public static int refuels(ArrayList<Integer> deliveries, int gasTank) {
        int Int = 0;
        for (Integer each : deliveries) {
            if (each%gasTank == 0){
                Int += each/gasTank;
            } else if (each < gasTank) Int += 1;
        }
        return  Int;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int fuel = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(refuels(list, fuel));
    }
}
