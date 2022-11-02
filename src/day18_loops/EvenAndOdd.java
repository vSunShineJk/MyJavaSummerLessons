package day18_loops;

public class EvenAndOdd {
    public static void main(String[] args) {

        int limit = 100;
        int count = 1;

        // printing all the even numbers

        while (count <= limit){

            if (count % 2 == 0){ // run for limit number of times. Go from 1 to limit
                System.out.print(count + " ");
            }
            count++;
        }
        System.out.println();

        // print all the odd numbers from limit to 1, backwards order

        int back = limit; // starting number based on the limit variable

        while (back >= 1){

            if (back % 2 == 1){ // checks for odd ! = 0
                System.out.print(back + " ");
            }
            back--;

        }

    }
}
