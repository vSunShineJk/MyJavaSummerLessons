package day35_custom_classes.traffic;

public class Road {
    public static void main(String[] args) {
        trafficLite light = new trafficLite("red");
        //light.color = "red";
        System.out.println(light.color);

        // invalidCase:
        trafficLite light2 = new trafficLite("blue");
        System.out.println(light2.color);
    }
}
