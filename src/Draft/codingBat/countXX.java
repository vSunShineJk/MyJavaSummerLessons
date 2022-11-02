package Draft.codingBat;

public class countXX {
    public static void main(String[] args) {
        String str = "Hexxo thxxe";

        int withOutX = str.replace("x","").length();
        int actualLen = str.length();
        System.out.println(actualLen);
        System.out.println(withOutX);

        int countXX = actualLen - withOutX - 1;
        System.out.println(countXX);

        if (str.contains("xx")){
            int count = actualLen - withOutX;
        }

    }
}
