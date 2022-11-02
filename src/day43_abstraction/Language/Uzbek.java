package day43_abstraction.Language;

public class Uzbek implements Language{
    @Override
    public void hello() {
        System.out.println("Salom");
    }

    @Override
    public void bye() {
        System.out.println("Hayir");
    }
}
