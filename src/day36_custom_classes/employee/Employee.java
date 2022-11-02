package day36_custom_classes.employee;

public class Employee {
    /*
    Create a class called employee

    -data:
        name, id, job, salary

    -constructor
        create a constructor that creates an Employee object with the name
     */

    String name;
    long id;
    String jobTitle;
    double salary;

    public Employee(String name){
        this.name = name;
    }

    public Employee(String name, long id){
        this(name);
        this.id = id;
    }

    public Employee(String name, long id, String jobTitle){
        this(name, id);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, long id, String jobTitle, double salary){
        this(name, id, jobTitle);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
