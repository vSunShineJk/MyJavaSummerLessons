package day35_custom_classes;

public class localVsInstance {
    // a & b are instance variables
    int a = 5;
    int b = 10;

    public localVsInstance(int a, int z){
         this.a = a; // local a is prioritized, with means here you are reassigning the local variable to itself, but that means the instance a did not change
        b = 2;
    }

    public void print(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        localVsInstance obj = new localVsInstance(20, 50);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
