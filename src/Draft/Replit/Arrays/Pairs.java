package Draft.Replit.Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Pairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<8;i++){
            arr[i] = input.nextLine();
        }

        //WRITE YOUR CODE BELOW:
//            System.out.println(arr[0] + ", " + arr[1]);
//            System.out.println(arr[1] + ", " + arr[2]);
//            System.out.println(arr[2] + ", " + arr[3]);
//            System.out.println(arr[3] + ", " + arr[4]);
//            System.out.println(arr[4] + ", " + arr[5]);
//            System.out.println(arr[5] + ", " + arr[6]);
//            System.out.println(arr[6] + ", " + arr[7]);

        // 1st method
            int k = 1;
            for (int i = 0; i < 7; i++){
                System.out.println(arr[i] + arr[k++]);
            }

        // 2nd method
            for (int i = 0, j = 1; i < 7; i++, j++){
                System.out.println(arr[i] + ", " + arr[j]);
            }

        // 3rd method
            for (int i = 0; i < 7; i++){
                 System.out.println(arr[i] + ", " + arr[i+1]);
            }
    }
}
