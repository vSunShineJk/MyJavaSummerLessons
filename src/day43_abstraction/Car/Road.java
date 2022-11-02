package day43_abstraction.Car;

public class Road {
    public static void main(String[] args) {
        Toyota obj1 = new Toyota();
        BMW obj2 = new BMW();
        Tesla obj3 = new Tesla();

        obj1.start();
        obj2.start();
        obj3.start();
        obj3.charge();
    }
}
