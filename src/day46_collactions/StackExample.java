package day46_collactions;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>(); // LIFO
        stack.push("a");
        stack.push("b");
        stack.push("c");
        System.out.println(stack);

        System.out.println("At the top " + stack.peek()); // checks what is at the top of the stack
        stack.pop(); // removes the element at the top of the stack and returns it
        System.out.println("At the top now " + stack.peek());
        System.out.println(stack);

        System.out.println(stack.pop() + " was removed from the stack");
        System.out.println(stack);

        // I can  use the methods from list, but for stack I want to use function og LIFO
        System.out.println(stack.get(0));
        stack.add("h");
    }
}
