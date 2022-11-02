package day49_functional_interface;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;

public class ConfigReader {

    private static Properties properties = new Properties();

    /*
        private: only accessible in the same class
        static: access by the class name instead of needed to create an object
        Properties: we are creating an object of ths class to connect a properties (text.properties) to a java object
     */

    static{
        try{
            FileInputStream file = new FileInputStream("test.properties");
            properties.load(file);
        } catch (IOException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
    }

    /*
        static block: run the code in the beginning to make sure everything is set up
        fileInputStream: connect to a file -> allows access to the information i some way
     */

    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
