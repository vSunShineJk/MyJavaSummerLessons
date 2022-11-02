package Draft.codingBat;

public class LoneSumm {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int sum = 0;
        if (a == b &&  b != c) sum = c;
        else if (a != b && b == c) sum = a;
        else if (a == c && a != b) sum = b;
        else if (a != b && b != c) sum = a + b + c;

        System.out.println(sum);
    }
}
