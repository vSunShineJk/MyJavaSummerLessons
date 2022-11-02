package Draft.codingBat;
import java.util.Arrays;

public class Array123 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 4, 5};
        String str2 = Arrays.toString(nums).replace(", ", "");
        System.out.println(str2.contains("123"));
    }
}
