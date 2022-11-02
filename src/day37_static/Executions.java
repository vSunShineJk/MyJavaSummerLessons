package day37_static;

public class Executions {

    public static void main(String[] args) {
        System.out.println(1);
        new Executions();
    }

    public Executions(){
        System.out.println(2);
    }

    static { // this block is run first (once), when ever the class is loaded(used)
        System.out.println(3);
    }
}
