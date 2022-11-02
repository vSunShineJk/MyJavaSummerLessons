package day43_abstraction.Language;

public class Speaking {
    public static void main(String[] args) {
//        Language obj = new Language(); cannot create object of interface
        System.out.println("ENGLISH:");
        English obj1 = new English();
        obj1.hello();
        obj1.bye();

        System.out.println("-------------------");
        System.out.println("SPANISH:");
        Spanish obj2 = new Spanish();
        obj2.hello();
        obj2.bye();

        System.out.println("-------------------");
        System.out.println("UZBEK:");
        Uzbek obj3 = new Uzbek();
        obj3.hello();
        obj3.bye();
    }
}
