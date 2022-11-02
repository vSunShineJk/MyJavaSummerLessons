package day29_methods;

public class ExtraPractice {
    /*
    Make a method that accept an int array. Take the sum of all the numbers and return the sum
     */
    public static void main(String[] args) {
        int[] nums = {1, 24, 5, 12};
        System.out.println(sumFromArray(nums));
        System.out.println(currencyConvertor("yen", 100));
        System.out.println(currencyConvertor("won", 100));
        System.out.println(currencyConvertor("RUPEE", 100));
        System.out.println(currencyConvertor("sum", 100));

        String name = "Lira";
        double price = 800;

        System.out.println(currencyConvertor(name, price));
    }

    public static int sumFromArray(int[] nums){
       int sum = 0;
       for (int eachNum: nums){
            sum += eachNum;
       }
       return sum;
    }

    public static double currencyConvertor(String type, double dollar){
        double convert = 0.0;
        switch (type.toLowerCase()){
            case "euro":
                convert = dollar*0.91;
                break;
            case "yen":
                convert = dollar*121.03;
                break;
            case "lira":
                convert = dollar*14.85;
                break;
            case "won":
                convert = dollar*1_217.52;
                break;
            case "rupee":
                convert = dollar*181.45;
                break;
            default:
                System.out.println("We cannot convert to " + type);
        }
        return convert;
    }
}
