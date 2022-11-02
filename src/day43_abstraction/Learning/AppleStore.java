package day43_abstraction.Learning;

public class AppleStore {
    public static void main(String[] args) {
        System.out.println(Mac.brand);
        System.out.println(Mac.os);
        Mac.getBrand();

        // use a class implements the interface
        Desktop obj = new Desktop();
        obj.turnOn();
        obj.typing();
        // obj.getBrand(); cannot access the static members from the classes that implement that interface.
        // only access static members of an interface by the implementation
    }
}
