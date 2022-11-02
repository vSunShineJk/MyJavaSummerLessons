package Draft.codingBat;

public class blackjack {
    public static void main(String[] args) {
        int a = 53;
        int b = 28;

        if (a <= 21 && b <= 21){
            if (a>b) System.out.println(a);
            else System.out.println(b);
        } else if (a > 21 && b > 21) System.out.println(0);
        else if (b > 21) System.out.println(a);
        else if (a > 21)System.out.println(b);
    }
}
