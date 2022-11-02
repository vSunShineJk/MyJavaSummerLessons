package Draft.Vehical;

public class Veal {

        String engine;
        String vehicle;
        double price;

    @Override
    public String toString() {
        return "Veal{" +
                "engine='" + engine + '\'' +
                ", vehicle='" + vehicle + '\'' +
                ", price=" + price +
                '}';
    }

    public Veal(String engine, String vehicle, double price){
            this.engine = engine;
            this.vehicle = vehicle;
            this.price = price;
        }
}
