package day17_string;

public class SmsParts {
    public static void main(String[] args) {

        String msg = "Sender: <James Bond>. From number: [202-123-3456]. + Massage: {\"I love programming and problem solving\"}";

        int startSender = msg.indexOf('<');
        int endSender = msg.indexOf('>');
        int startNumber = msg.indexOf('[');
        int endNumber = msg.indexOf(']');
        int startMsg = msg.indexOf('{');
        int endMsg = msg.indexOf('}');

        String sender = msg.substring(startSender + 1, endSender);
        String number = msg.substring(startNumber + 1, endNumber);
        String msgPart = msg.substring(startMsg + 1, endMsg);

        System.out.println("Sender: " + sender);
        System.out.println("Number: " + number);
        System.out.println("Massage: " + msgPart);
    }
}
