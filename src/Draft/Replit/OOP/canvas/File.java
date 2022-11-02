package Draft.Replit.OOP.canvas;

public class File {
    String name;
    double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public void openFile(){
        System.out.println("Opening " + name);
    }

    @Override
    public String toString() {
        return "File{" + name + " | " + size + "mb}";
    }
}
