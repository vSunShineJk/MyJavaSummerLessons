package day37_static.phone;

public class IPhone {
    String model;
    String color;
    double price;
    int storage;
    static String os;
    static String brand;
    static{
        os = "IOS";
        brand = "Apple";
    }

    public IPhone(String model, String color, double price, int storage) {
        this.model = model;
        this.color = color;
        this.price = price;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
