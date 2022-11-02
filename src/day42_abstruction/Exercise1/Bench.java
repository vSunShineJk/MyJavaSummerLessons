package day42_abstruction.Exercise1;

public class Bench extends Lifting{
    // Bench is my concrete class

    @Override
    public void perform() {
        System.out.println("Bench press");
    }

    @Override
    public void getCaloriesBurned(int minutes) {
        System.out.println(10 * minutes);
    }

    @Override
    public void rackWeight() {
        System.out.println("Putting the bar back on the rack");
    }
}
