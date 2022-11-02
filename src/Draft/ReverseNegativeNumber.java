package Draft;

public class ReverseNegativeNumber {
    public static int reverse(int number){
        // -321 --> -123
        String numberStr = String.valueOf(number);
        String num = "";
        int reversed = -1;

        for (int i = numberStr.length()-1; i > 0 ; i--) {
            num += numberStr.substring(i,i+1);
        }
        return reversed*Integer.parseInt(num);
    }

    public static void main(String[] args) {
        System.out.println(reverse(-321));
    }
}
