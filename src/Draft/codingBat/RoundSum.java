package Draft.codingBat;

public class RoundSum {
    public static int roundSum1(int a, int b, int c){
        int sum = 0;
        sum += round10(a);
        sum += round10(b);
        sum += round10(c);
        return sum;
    }

    public static int round10(int num ){ // num = 17
        int rounded = 0;
        if (num < 10){
            if (num >= 5) rounded = 10;
        } else {
            int divide = num%10;
            if (divide >= 5) rounded = num + (10 - divide);
            else rounded = num - divide;
        }
        return rounded;
    }

    public static void main(String[] args) {
        System.out.println(roundSum1(12, 10, 24));
    }

}
