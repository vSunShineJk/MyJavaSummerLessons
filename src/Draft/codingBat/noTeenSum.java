package Draft.codingBat;

public class noTeenSum {

    public int noTeenSum1(int a, int b, int c){
        int sum = 0;
        sum += fixTeen(a);
        sum += fixTeen(b);
        sum += fixTeen(c);
        return sum;
    }

    public int fixTeen(int n){
        int fixed = 0;
        if (n > 19 || n < 13 || n == 16 || n == 15) fixed = n;
        return fixed;
    }

    public static void main(String[] args) {
        noTeenSum obj = new noTeenSum();
        System.out.println(obj.noTeenSum1(6, 17, 18));
    }
}
