package day43_abstraction.Learning;

public interface Mac {
    public static final String brand = "Apple";
    String os = "IOS";

    // brand and OS are both public static final variables
    // instance variables(not static) are not allowed in interface

    // methods: in interface you can define abstract methods(which are default), static, default

    void turnOn(); // public abstract void turnOn();

    public static void getBrand(){ // public is gray because, every thing is public by default
        System.out.println("The brand is Apple");
    }

    public default void typing(){ // default allows us to create a implementation in the interface. It is NOT default access modifier. This is an instance method for thr class that implements.
        System.out.println("Typing on apple keyboard");
    }
}
