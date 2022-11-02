package day45_polymorphism.building;

public class Apartment extends Building implements HasBalcony {
    int monthOfLease;

    public Apartment(String location, double price, int monthOfLease) {
        super(location, price);
        this.monthOfLease = monthOfLease;
    }

    @Override
    public void pay() {
        System.out.println("Paying rent for apartment");
    }

    @Override
    public void openBalcony() {
        System.out.println("opening door for balcony");
    }

    public String toString(){
        return super.toString() + " monthOfLease: " + monthOfLease;
    }
}
