package day49_functional_interface;

public class UsingNumber {
    public static void main(String[] args) {

        NumberInterface evenOrOdd = (n) -> {

            if (n%2==0){
                System.out.println(n+" is even");
            } else {
                System.out.println(n+" is odd");
            }

        };

        evenOrOdd.test(8);
        evenOrOdd.test(7);

        NumberInterface cube = (n) -> {
            System.out.println(n*n*n);
        };

        cube.test(24);

    }

}
