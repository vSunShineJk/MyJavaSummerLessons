package MyJavaSchool;

public class JavaCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        System.out.println("------------------------------------------------");

        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manuall casting: double to int

        System.out.println(myDouble2); // outputs: 9.78
        System.out.println(myInt2); // outputs: 9

        System.out.println("------------------------------------------------");

        long myLong = 123456789l;
        byte myByte = (byte) myLong;

        System.out.println(myLong);
        System.out.println(myByte);

        System.out.println("------------------------------------------------");

        long myLong2 = 123456789l;
        short myInt3 = (short) myLong2;

        System.out.println(myLong2);
        System.out.println(myInt3);
    }
}
