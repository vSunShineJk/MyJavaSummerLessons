package day42_abstruction;

public class InvalidSelectionException extends Exception { // being a sub class of Exception class makes this a checked exception

    public InvalidSelectionException(){
        System.out.println("possible options are 1, 2 and 3");
    }

}
