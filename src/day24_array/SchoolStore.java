package day24_array;

public class SchoolStore {
    public static void main(String[] args) {
        String[] items = {"Backpack" , "Jacket", "Shirt", "Macbook", "Notebook", "Headphones"};
        double[] prices = {59.99, 150.0, 10.50, 1_000, 3.49, 15.99};
        int[] itemId = {500101, 500102, 500103, 500104, 500105, 500106};

        // print the catalog

        System.out.println("Full Catalog\nID     | NAME     | PRICE");

        for (int i = 0; i < items.length; i++){
            System.out.println(itemId[i] + " | " + items[i] + " | $ " + prices[i]);
        }

        // finding if jackets in the store

        boolean inStock = false;
        for (String eahItem : items){

            if (eahItem.equalsIgnoreCase("jacket")){
                inStock = true;
                break;
            }

        }
        System.out.println(inStock ? "Jacket is in stock" : "We don't have jackets right now");
        System.out.println();

        // find the index of notebook

        int index = -1;
        for (int i =  0; i < items.length; i++){

            if (items[i].equalsIgnoreCase("notebook")){
                index = i;
            }
        }
        System.out.println("Index of notebook: " + index);
        System.out.println();
         // find the information about th most expensive item
        double maxPrice = prices[0];
        int indexOfMax = 0;

        for (int i = 0; i < prices.length; i++){

            if (prices[i] > maxPrice){
                maxPrice = prices[i];
                indexOfMax = i;
            }
        }
        System.out.println("Most Expensive item: " + itemId[indexOfMax] + " | " + items[indexOfMax] + " | " + prices[indexOfMax]);

    }
}
