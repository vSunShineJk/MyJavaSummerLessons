package Draft.Replit.OOP.canvas;

import java.util.ArrayList;

public class Module {
    String name;
    ArrayList<File> files;

    public Module(String name) {
        this.name = name;
        files = new ArrayList<>();
    }

    public Module(String name, ArrayList<File> files) {
        this.name = name;
        this.files = files;
    }

    public void removeFile(){

    }
}
