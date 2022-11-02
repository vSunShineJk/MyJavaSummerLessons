package Draft.codingBat.AP_1;

public class DividesSelf {
    public static void main(String[] args) {
        int n = 122; // n  = 128
        boolean isDivided = false;

        if (!String.valueOf(n).contains("0")) {
            int rightDig = n%10;
            int leftmost = n/10;

            if (leftmost > 10){
                int left = leftmost/10;
                int right = leftmost%10;
                if (n%right == 0 && n%left == 0 && n%right == 0) isDivided = true;
            } else {
                if (n%rightDig == 0 && n%leftmost == 0) isDivided = true;
            }
        }
        System.out.println(isDivided);
    }
}
