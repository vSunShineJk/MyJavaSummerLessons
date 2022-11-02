package day45_polymorphism.building;

public class OfficeBuilding extends Building implements HasElevator{
    int numberOfFloors;

    public OfficeBuilding(String location, double price, int numberOfFloors) {
        super(location, price);
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public void pay() {
        System.out.println("paying rent for office place");
    }

    @Override
    public void elevator(int floor) {
        System.out.println("we are going to floor " + floor);
    }

    public String toString(){
        return super.toString() + " number of floors: " + numberOfFloors;
    }
}
