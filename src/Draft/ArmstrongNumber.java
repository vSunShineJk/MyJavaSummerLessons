package Draft;

public class ArmstrongNumber {
    // 371 = 3*3*3 + 7*7*7 + 1*1*1
    public static boolean isArmstrongNumber(int number){
        String numberStr = String.valueOf(number);
        int save = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            int each = Integer.parseInt(numberStr.substring(i,i+1));
            save += each * each * each;
        }
        return (number == save);
    }

    public static void main(String[] args) {
        System.out.println("isArmstrongNumber() = " + isArmstrongNumber(153));
    }
}
