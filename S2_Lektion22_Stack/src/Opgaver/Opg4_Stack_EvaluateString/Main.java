package Opgaver.Opg4_Stack_EvaluateString;

public class Main {
    public static void main(String[] args) {
        // Use an implementation of StackI interface
        StackI stack = new ArrayDropOutStack(50);
        PostFixEvaluator evaluator = new PostFixEvaluator(stack);

        String input = "12 2 5 + - 4 * 2 /";
        try {
            int result = evaluator.evaluate(input);
            System.out.println("The result of the postfix expression " + input + " is: " + result);
        } catch (RuntimeException ex) {
            System.out.println("Error evaluating postfix expression: " + ex.getMessage());
        }
    }
}
