package Draft.codingBat;

public class EvenlySpaced {
    public static void main(String[] args) {
        int a = 2, b = 4, c = 6;
        int max = 0, min = 0, med = 0;
        boolean isEvenly = false;

        if (a > b && a > c) {
            max = a;
            if (b > c){
                med = b;
                min = c;
            } else {
                med = c;
                min = b;
            }
            if (max - med == med - min) isEvenly = true;
        } else if (b > a && b > c){
            max = b;
            if (a > c){
                med = a;
                min = c;
            } else {
                med = c;
                min = a;
            }
            if (max - med == med - min) isEvenly = true;
        } else if (c > a && c > b){
            max = c;
            if (a > b) {
                med = a;
                min = b;
            }
            else {
                med = b;
                min = a;
            }
            if (max - med == med - min) isEvenly = true;
        } else if (a == b && a == c) isEvenly = true;
        System.out.println(isEvenly + " - max: " + max + ", med: " + med + ", min: " + min);
    }
}
