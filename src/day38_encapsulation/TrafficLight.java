package day38_encapsulation;

public class TrafficLight {
    private String color;

    public String getColor(){
        return color;
    }

    private void setColor(String color){
        if (color.equals("green") || color.equals("red") || color.equals("yellow")){
            this.color = color;
        } // if this boolean is false (not a valid color) then nothing is assigned to the color variable
    }

}
