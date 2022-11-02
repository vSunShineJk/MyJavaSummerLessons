package day42_abstruction;

public class Runner {
//    public static void main(String[] args) {
//        System.out.println(VendingMachine.select(1));
//        // This method has unchecked exception - normally these exceptions are not handle
//
//        //select(2) --> causes the exception
//
//        try {
//            System.out.println(VendingMachine.selectValid(5));
//        } catch (InvalidSelectionException e){
//            System.out.println(e.getMessage());
//        }
//   }

    public static void main(String[] args) throws InvalidSelectionException {
        System.out.println(VendingMachine.selectValid(5));
    }
}
