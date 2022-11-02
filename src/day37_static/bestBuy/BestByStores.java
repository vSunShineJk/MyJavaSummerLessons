package day37_static.bestBuy;

import day37_static.bestBuy.BestBuy;

public class BestByStores {

    public static void main(String[] args) {

        System.out.println("------------------------------------");

        //BestBuy.location = "Fairfax"; // location is an instance variable, so we can need an object in order to access
        BestBuy store1 = new BestBuy();
        store1.location = "Fairfax";
        System.out.println(store1.location);

        System.out.println(BestBuy.headquarters); // this is a static variable, which means we can use class name to access
        System.out.println(store1.headquarters); // instances(object) come from a class & static members belong to class. This is a valid syntax, but you should use the class name to access, but instance references

        System.out.println("------------------------------------");

        // other static members
        System.out.println(Math.PI); // PI is static
        System.out.println(Integer.MIN_VALUE);

        //Arrays.sort(); accessing static methods from Arrays to class

        System.out.println("------------------------------------");
    }

}
