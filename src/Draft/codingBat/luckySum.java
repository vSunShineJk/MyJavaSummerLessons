package Draft.codingBat;

public class luckySum {
    public static void main(String[] args) {
        int a = 13;
        int b = 13;
        int c = 3;

        int sum = 0;
        if (a != 13) {
            sum += a;
            if (b != 13) {
                sum += b;
                if (c != 13) sum += c;
            }
        }
        System.out.println(sum);
    }
}
