package day35_custom_classes.rectangle;

public class Rectangle {
    /*
        Create a class rectangle
        create instance variables:
           base, height, perimeter, area

        crete instance methods:
            -toString(): [return String]
                returns all the information of the rectangle object, including the perimeter and area

            -calculatePerimeter(): [void]
                calculate the perimeter and store the result into the perimeter instance variable

                a perimeter of rectangle is the sum fo sides together

            -calculateArea(): [void]
                calculate the area and store the result into the area instance variable
     */
    double base;
    double height;
    double perimeter;
    double area;

    public void calculatePerimeter(){
        perimeter = 2 * base + 2 * height;
    }

    public void calculateArea(){
        area = base * height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + base +
                ", height=" + height +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
