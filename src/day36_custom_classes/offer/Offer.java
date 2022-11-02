package day36_custom_classes.offer;

public class Offer {
    /*
        create a class called Offer

        -dat:
            company, location, salary, is full time, number of PTO
     */

        String company;
        String location;
        double salary;
        boolean isFullTime;
        int NUmOfPto;

    public Offer(String company, String location){
        this.company = company;
        this.location = location;
    }

    public Offer(String company, String location, double salary){
        this(company, location);
        this.salary  = salary;
    }

    public Offer(String company, String location, double salary, boolean isFullTime, int numOfPto){
        this(company, location, salary);
        this.isFullTime = isFullTime;
        this.NUmOfPto = numOfPto;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "company='" + company + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", NUmOfPto=" + NUmOfPto +
                '}';
    }
}
