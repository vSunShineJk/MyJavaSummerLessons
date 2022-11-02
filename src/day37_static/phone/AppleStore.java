package day37_static.phone;

public class AppleStore {
    public static void main(String[] args) {

        System.out.println(IPhone.brand);

        IPhone iPhone1 = new IPhone("IPhone X", "Black", 1000, 256);
        System.out.println(iPhone1);
        System.out.println(IPhone.brand);
        System.out.println(IPhone.os);

        // we could use the object to access to static variables, but better to use the class name

        IPhone iphone2 = new IPhone("Iphone 7", "silver", 1000, 256);
        System.out.println(iphone2);
    }


}
