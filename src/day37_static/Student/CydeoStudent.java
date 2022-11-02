package day37_static.Student;

import java.util.Arrays;

public class CydeoStudent {

    // instance variables
    String name;
    String city;
    int group;
    Coffee myCoffee;

    // static variables
    static int batchNumber;
    static String schoolName;
    static String[] instructors; // static means one copy, belongs to class, all abject share. String[] type

    static{
         batchNumber = 27;
         schoolName = "Cydeo";
         instructors = new String[]{"Adam", "Asya", "Saim"}; // created a new String array and assigned the instructors reference
    }

    public CydeoStudent(String name, String city, int group) {
        this.name = name;
        this.city = city;
        this.group = group;
        myCoffee = new Coffee(16);
    }

    public static void schoolInfo(){
        System.out.println(schoolName + " Batch " + batchNumber);
        System.out.println("Instructors " + Arrays.toString(instructors));
    }

    public void drink(){
        myCoffee.amountLeft -= 2;
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", group=" + group +
                '}';
    }
}
