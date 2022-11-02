package day36_custom_classes.song;

public class radio {
    public static void main(String[] args) {
        song song = new song("Coldplay", 55, "Dua Lipa", "Pop");
        System.out.println(song);

        song song2 = new song("Four season", 2.8);
        System.out.println(song2);
    }
}
