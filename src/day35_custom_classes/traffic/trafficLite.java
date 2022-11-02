package day35_custom_classes.traffic;

public class trafficLite {
    String color;

    public trafficLite(String inputColor){

        boolean isValid = inputColor.equalsIgnoreCase("red") || inputColor.equalsIgnoreCase("yellow") || inputColor.equalsIgnoreCase("green");

        if (isValid){
            color = inputColor;
        }
    }
}
