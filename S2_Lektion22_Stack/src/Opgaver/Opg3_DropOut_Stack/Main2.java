package Opgaver.Opg3_DropOut_Stack;

public class Main2 {
    public static void main(String[] args) {
        ArrayDropOutStack stack = new ArrayDropOutStack(3);

        System.out.println("Is stack empty? " + stack.isEmpty()); // true

        stack.push("one");
        stack.push("two");
        stack.push("three");

        System.out.println("Is stack empty? " + stack.isEmpty()); // false
        System.out.println("Stack size: " + stack.size()); // 3

        stack.push("four"); // "one" should drop out here

        System.out.println("Stack size: " + stack.size()); // 3
        System.out.println("Top of stack: " + stack.peek()); // four

        System.out.println("Popping: " + stack.pop()); // four
        System.out.println("Popping: " + stack.pop()); // three
        System.out.println("Popping: " + stack.pop()); // two

        // Now the stack should be empty again
        System.out.println("Is stack empty? " + stack.isEmpty()); // true
    }
}
