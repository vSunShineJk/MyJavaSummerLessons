package day30_practice_wrapper;

import my_utils.ArrayUtil;

import java.util.Arrays;

public class UsingArraysUtilClass {
    public static void main(String[] args) {
        System.out.println("Min & Max numbers");
        System.out.println("Min number is: "+ArrayUtil.min(4, 2, 1, 5, 1, -1, 2, 5, 2, -1, 5));
        System.out.println("Max number is: "+ArrayUtil.max(4, 2, 1, 5, 1, -1, 2, 5, 2, -1, 5));

        System.out.println("----------------------");

        int num = ArrayUtil.min(8, 7, 6, 5, 4);
        System.out.println("Min number is: " + num);
        int num2 = ArrayUtil.max(9, 8, 7, 6, 5);
        System.out.println("Max number is: " + num2);

        System.out.println("----------------------");

        int[] a = {120, 131, 994, 515, 811};
        System.out.println("Min number is: " + ArrayUtil.min(a));
        System.out.println("Max number is: " + ArrayUtil.max(a));

        System.out.println("----------------------");

        System.out.println("Min number is: " + ArrayUtil.min(new int[]{6,5,4,3,2}));
        System.out.println("Max number is: " + ArrayUtil.max(new int[]{6,5,4,3,2}));

        System.out.println("----------------------\nIs statement contains the number");

        int[] b = {4, 5, 6, 7, 8};
        System.out.println(ArrayUtil.contains(b,8));
        System.out.println(ArrayUtil.contains(b,12));

        System.out.println("----------------------");

        // Index of the number
        int[] c = {4, 5, 6, 7, 8};
        System.out.println("Index of 6 is " + ArrayUtil.indexOf(c,6));
        System.out.println("Index of 9 is " + ArrayUtil.indexOf(c,9));

        System.out.println("----------------------");

        System.out.println("Overloaded use: ");
        int[] d = {4, 5, 6, 7, 8, 9, 4, 5, 6, 7, 8 ,9};
        System.out.println("Index of 6 is " + ArrayUtil.indexOf(d,6));
        System.out.println("Index of 6 is " + ArrayUtil.indexOf(d,6, 7));

        //------------------------------------------

        int firstIndex = ArrayUtil.indexOf(d,6); // same as line 47
        int secondIndex = ArrayUtil.indexOf(d,6,firstIndex + 1); // same as 48

        System.out.println("----------------------\nAdd element method");

        String[] words = {"java", "is", "the", "best"};
        // I want to add: Language into the array
        String[] allWords = ArrayUtil.addElement(words,"language");
        System.out.println(Arrays.toString(allWords));

        System.out.println("----------------------\nAdd element method2");

        String[] strs = {"today", "is", "monday"};
        String[] other = {"no", "softskills", "today"};

        String[] multipleAdded = ArrayUtil.addElement(strs,other);
        System.out.println(Arrays.toString(multipleAdded));
    }
}
