package day42_abstruction.persone;

import java.util.ArrayList;
import java.util.Arrays;

public class WorkPlace {
    public static void main(String[] args) {
        //Person obj = new Person;

        Tester baz = new Tester("Baz", 20, "SDET", 100_000);
        System.out.println(baz);

        baz.sleep(8);
        baz.work();

        ArrayList<Tester> testers = new ArrayList<>();
        testers.add(baz);
        testers.addAll(Arrays.asList(new Tester("Bato", 30, "SDET", 150000),
                                     new Tester("Bato", 30, "SDET", 150000)));

        System.out.println();

        for (Tester each : testers){
            System.out.println(each);

            each.sleep(8);
            System.out.println();
        }
    }
}
