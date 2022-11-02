package day37_static.car;

import javax.management.DescriptorRead;

public class Driver {

    String name;
    long licenceNUmber;
    char licenceType;

    public Driver(String name, long licenceNUmber, char licenceType) {
        this.name = name;
        this.licenceNUmber = licenceNUmber;
        this.licenceType = licenceType;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenceNUmber=" + licenceNUmber +
                ", licenceType=" + licenceType +
                '}';
    }
}
