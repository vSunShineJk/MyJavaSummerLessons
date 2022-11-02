package day37_static.Student;

import java.util.Arrays;

public class Classroom {
    public static void main(String[] args) {
        CydeoStudent.schoolInfo();
        CydeoStudent mayila = new CydeoStudent("Mayila", "Toronto", 2);
        System.out.println(mayila);
        System.out.println(Arrays.toString(mayila.instructors)); // not recommended, just the class name to access
        System.out.println(Arrays.toString(CydeoStudent.instructors));

        System.out.println(CydeoStudent.instructors[1].charAt(3));

        System.out.println(mayila.myCoffee.amountLeft);
        mayila.drink();
        System.out.println(mayila.myCoffee.amountLeft);

        CydeoStudent aili = new CydeoStudent("Aili", "Ottawa", 1);
        System.out.println(aili.myCoffee.amountLeft);
    }
}
