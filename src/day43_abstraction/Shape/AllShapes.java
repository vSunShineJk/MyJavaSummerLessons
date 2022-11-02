package day43_abstraction.Shape;

public class AllShapes {
    public static void main(String[] args) {
        Circle obj1 = new Circle(4.6);
        System.out.println(obj1.area());
        System.out.println(obj1.perimeter());
        System.out.println(obj1.name);
        System.out.println(obj1.radius);
    }
}
