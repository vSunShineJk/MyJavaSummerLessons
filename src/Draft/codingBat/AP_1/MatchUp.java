package Draft.codingBat.AP_1;

public class MatchUp {
    public static void main(String[] args) {
        String[] a = {"aa", "bb", "cc"};
        String[] b = {"aaa", "b", "bb"};

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].isEmpty() && !b[i].isEmpty() && a[i].substring(0,1).equals(b[i].substring(0,1))) count++;
        }

        System.out.println(count);
    }
}
