package day29_methods;

import day28_methods.Numbers;

public class TestCalling {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 5};
        int sum = ExtraPractice.sumFromArray(arr);
        System.out.println(sum);

        double value = ExtraPractice.currencyConvertor("won", 103);
        System.out.println(value);

        Numbers.CheckNum(5);
    }
}
