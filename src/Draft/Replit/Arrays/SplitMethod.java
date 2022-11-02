package Draft.Replit.Arrays;
import java.util.Scanner;
public class SplitMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TYPE YOUR CODE BELOW:
        String[] split = sentence.split(" ");

        for(String each : split){
            System.out.println(each);
        }
    }
}
