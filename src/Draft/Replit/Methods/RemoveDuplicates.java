package Draft.Replit.Methods;
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "spoon";
        String store = String.valueOf(str.charAt(0));

        for (int i = 1; i<=str.length()-1; i++){
            String eachLetter = str.substring(i, i+1);
            if (store.contains(eachLetter)){
            } else {
                store += eachLetter;
            }
        }

        System.out.println(store);
    }
}
