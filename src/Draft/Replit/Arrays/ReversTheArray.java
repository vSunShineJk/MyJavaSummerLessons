package Draft.Replit.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ReversTheArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++) {
            arr[i] = input.nextLine();
        }
        // Write your code below:

        String[] arr2 = new String[5];
//        arr2[0] = arr[4];
//        arr2[1] = arr[3];
//        arr2[2] = arr[2];
//        arr2[3] = arr[1];
//        arr2[4] = arr[0];


        int h = 4;

        for (int t = 0; t < 5; t++){
            arr2[t] = arr[h--];
        }

        System.out.println(Arrays.toString(arr2));

    }
}
