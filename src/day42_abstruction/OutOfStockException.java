package day42_abstruction;

public class OutOfStockException extends RuntimeException{ // being of RunTiException means we created an unchecked exception

    public OutOfStockException(){
        super("Item is out of stock"); // this helps us define the message of the exception
    }

}
