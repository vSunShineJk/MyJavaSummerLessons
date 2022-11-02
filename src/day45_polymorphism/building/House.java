package day45_polymorphism.building;
public class House extends Building implements HasBackyard{
    int numberOfResidents;

    public House(String location, double price, int numberOfResidents) {
        super(location, price);
        this.numberOfResidents = numberOfResidents;
    }

    @Override
    public void pay() {
        System.out.println("paying mortgage");
    }

    @Override
    public void mowLawn() {
        System.out.println("mowing the lawn the backyard");
    }

    public String toString(){
        return super.toString() + " numberOfResidents: " + numberOfResidents;
    }
}
