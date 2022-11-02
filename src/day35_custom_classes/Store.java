package day35_custom_classes;

public class Store {
    public static void main(String[] args) {
        carpet kover = new carpet(12.5, 35, 12.99, false);
        System.out.println(kover);

        carpet persian = new carpet(12.5, 35, 12.99, true);
        System.out.println(persian);
    }
}
