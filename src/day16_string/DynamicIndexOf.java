package day16_string;

public class DynamicIndexOf {
    public static void main(String[] args) {
        String str = "Definition";
        //            0123456789
        // goal is to find all the index of all the 'i' character

        System.out.println("First i: " +str.indexOf('i'));
        System.out.println("Last i: " + str.lastIndexOf('i'));

        System.out.println("other use of indexof");

        System.out.println("First i: " + str.indexOf('i'));
        System.out.println("Second i: " + str.indexOf('i', 4));
        System.out.println("Third i: " + str.indexOf('i', 6));

        System.out.println("Hard coded above --------- Dynamic below");

        int firstI = str.indexOf('i');
        int secondI = str.indexOf('i', firstI + 1);
        int thirdI = str.indexOf('i', secondI + 1);

    }
}
