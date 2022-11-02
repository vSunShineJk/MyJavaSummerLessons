package day44_polimorphism.animals;

public class Wild {
    public static void main(String[] args) {
        // Lizard objects with all reference

        // reference of itself
        Lizard lizard1 = new Lizard();

        // reference of super class
        Reptile lizard2 = new Lizard();
        Animal lizard3 = new Lizard();

        lizard1.eat();
        lizard2.eat();
        lizard3.eat();
    }
}
