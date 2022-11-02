package Draft.codingBat.AP_1;

import java.util.Arrays;

public class ScoresSpecial {
    public int scoresSpecial(int[] a, int[] b) {
        return largesNumOfArr(a) + largesNumOfArr(b);
    }

    public int largesNumOfArr(int[] arr){
        Arrays.sort(arr);

        int largest = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i]%10==0) {
                largest = arr[i];
                break;
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        ScoresSpecial obj = new ScoresSpecial();
        //System.out.println(obj.largesNumOfArr(new int[]{12, 11, 4}));
        System.out.println(obj.scoresSpecial(new int[]{12, 10, 4}, new int[]{2, 20, 30}));
    }
}
