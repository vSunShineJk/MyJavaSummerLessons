package day35_custom_classes;

public class carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    double totalPrice;

    public carpet(double inputWidth, double inputLength, double inputUnitPrice, boolean inputPersian){
        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        isPersian = inputPersian;
        calculatePrice();
    }

    public void calculatePrice(){
        totalPrice = width * length * unitPrice;

        if (isPersian){
            totalPrice += 200;
        }
    }

    @Override
    public String toString() {
        return "carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", " + (isPersian ? "Persian" : "Regular") + "carpet" +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
