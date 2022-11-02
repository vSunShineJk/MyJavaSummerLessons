package Draft.codingBat.AP_1;

public class SumHeights {
    public static void main(String[] args) {
        int[] heights = {5,3,6,7,2};
        int start = 0;
        int end = 4;

        int sum = 0;

        for (int i = start, j = start + 1; i <= end && j <= end; i++, j++) {
            sum += Math.abs(heights[i] - heights[j]);
        }
        System.out.println(sum);
    }
}
