package day17_string;

public class RelativeChecker {
    public static void main(String[] args) {

        String name1 = "James Bond"; // nextLine()
        String name2 = "Jamie Bond"; // nextLine()

        int indexOfSpace = name1.lastIndexOf(' ');
        String lastName = name1.substring(indexOfSpace + 1); // name1.substring(indexOfSpace).trim();

        if (name2.endsWith(lastName)){
            System.out.println("Related");
        } else {
            System.out.println("Not related");
        }

        System.out.println(name2.endsWith(lastName) ? "Related" : "Not related");
    }
}
