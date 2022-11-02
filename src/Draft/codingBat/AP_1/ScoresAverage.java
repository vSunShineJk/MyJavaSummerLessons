package Draft.codingBat.AP_1;

public class ScoresAverage {
    public int scoresAverage(int[] scores) {
        int firstHalf = average(scores,0,scores.length/2);
        int secondHalf = average(scores,scores.length/2, scores.length);

        return Math.max(firstHalf, secondHalf);
    }

    public int average(int[] scores, int start, int end){

        int sumOfHalf = 0;
        int len = end - start;
        for (int i = start; i < end; i++) sumOfHalf += scores[i];
        return sumOfHalf/len;
    }

    public static void main(String[] args) {
        ScoresAverage obj = new ScoresAverage();
        System.out.println(obj.scoresAverage(new int[]{2, 2, 4, 4}));
    }
}
