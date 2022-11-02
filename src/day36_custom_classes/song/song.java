package day36_custom_classes.song;

public class song {
    /*
    create a class called Songs

    -data:
        name, length, artist, genre

    - constructor:
        -create a constructor that creates a Song object with the name, length, artist and genre

    -method:
        -toString()
            print all song information

    Create a separate class to create and test the Song object
     */

    String name;
    double length;
    String artist;
    String genre;

    public song(String name, double length){
        this.name = name;
        this.length = length;
    }

    public song(String name, double length, String artist, String genre){
        this.name = name;
        this.length = length;
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "song{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", artist='" + artist + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
