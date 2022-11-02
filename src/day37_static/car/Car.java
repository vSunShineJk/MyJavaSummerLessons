package day37_static.car;

public class Car {

    String model;
    Driver driver;

    // when I call the Car constructor, the code inside is calling the Driver constructor
    public Car(String model, String name, long licenceNumber, char licenseTYpe){
        this.model = model;
        driver = new Driver(name, licenceNumber, licenseTYpe); // creating a Driver object
    }

    public Car(String madel, Driver driver){
        this.model = madel;
        this.driver = driver;
    }
}
