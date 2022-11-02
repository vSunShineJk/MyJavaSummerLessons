package Draft.Replit.Loops;

import java.util.Arrays;

public class ForEach {

    public static void main(String[] args) {
        double[] d = new double[4];

        d[0] = 1.5;
        d[2] = 4.4;
        d[3] = 12.65;

        System.out.println(Arrays.toString(d));

        for (double each : d) {
            System.out.println("this is " + each);
        }
    }
}
