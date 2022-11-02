package day27_methods;

import java.rmi.MarshalException;

public class Parameters {
    public static void greeting(String name){
        System.out.println("Hello " + name);
        System.out.println("nice to meet you " + name);
    }

    public static void age(int birthYear){
        System.out.println("You are " + (2022 - birthYear) + " years old");
    }

    public static void main(String[] args) {
        greeting("Umid");
        greeting("Abubakr");

        age(2000);
        age(1987);
    }
}
