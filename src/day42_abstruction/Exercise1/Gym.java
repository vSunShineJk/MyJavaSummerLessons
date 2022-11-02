package day42_abstruction.Exercise1;

public class Gym {
    public static void main(String[] args) {
       // Exercise run = new Exercise(); not valid because Exercise is abstract - cannot create object from it

        Running run = new Running();
        run.perform();
        run.getCaloriesBurned(30);

        // Lifting obj = new Lifting(); Lofting is abstract - we cannot create an object of this class

        Bench obj = new Bench();
        obj.perform();
        obj.getCaloriesBurned(19);
        obj.rackWeight();
    }
}
