package day39_inheritance.Food;

public class Pizza {
//-------------------------------------------------------------------------------------------
    private String size;
    private int numberOfToppings;
//-------------------------------------------------------------------------------------------
    public Pizza() {}

    public Pizza(String size, int numberOfToppings){
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }
//-------------------------------------------------------------------------------------------
    public String getSize() {
        return size;
    }
//-------------------------------------------------------------------------------------------
    public void setSize(String size){

        if (size.equals("small") || size.equals("medium") || size.equals("large")){
            this.size = size;
        }

    }
//-------------------------------------------------------------------------------------------
    public int getNumberOfToppings(){
        return numberOfToppings;
    }
//-------------------------------------------------------------------------------------------
    public void setNumberOfToppings(int numberOfToppings){
        if (numberOfToppings >= 0){
            this.numberOfToppings = numberOfToppings;
        }
    }
//-------------------------------------------------------------------------------------------
    public double calculatePrice(){
        if (size != null){
            return (size.equals("small") ? 4 : size.equals("medium") ? 6 : 8) + numberOfToppings * 0.75;
        }
        return -1; // return -1 if the size was not assigned
    }
//-------------------------------------------------------------------------------------------
    public String toString(){
        return "size: " + size + ", numberOfToppings: " + numberOfToppings + ", total price: " + calculatePrice();
    }
//-------------------------------------------------------------------------------------------
}