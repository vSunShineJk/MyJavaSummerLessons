package day43_abstraction.Language;

@SuppressWarnings("SpellCheckingInspection")
public class Spanish  implements Language{
    @Override
    public void hello() {
        System.out.println("Hola");
    }

    @Override
    public void bye() {
        System.out.println("Adios");
    }
}
