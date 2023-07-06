package Opgaver.Opg4_Stack_EvaluateString;

public class PostFixEvaluator {
    private StackI stack; // Stack til at evaluere postfix-udtrykket

    public PostFixEvaluator(StackI stack) {
        this.stack = stack; // Gemmer en reference til den angivne stack
    }

    public int evaluate(String input) {
        String[] tokens = input.split("\\s+"); // Opdeler input-strengen i tokens (delimenteret af mellemrum)
        for (String token : tokens) {
            if (isOperator(token)) { // Hvis token er en operator
                try {
                    int op2 = Integer.parseInt((String) stack.pop()); // Henter det andet operand fra stacken
                    int op1 = Integer.parseInt((String) stack.pop()); // Henter det første operand fra stacken
                    stack.push(evaluate(op1, op2, token)); // Evaluere operationen og tilføjer resultatet til stacken
                } catch (Exception ex) {
                    throw new RuntimeException("Invalid postfix expression"); // Kaster en undtagelse hvis postfix-udtrykket er ugyldigt
                }
            } else {
                stack.push(token); // Hvis token er et tal, tilføjes det direkte til stacken
            }
        }
        return Integer.parseInt((String) stack.pop()); // Resultatet er det eneste tilbageværende element i stacken
    }

    private boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"); // Tjekker om token er en af de fire grundlæggende operatorer
    }

    private String evaluate(int op1, int op2, String operator) {
        switch (operator) { // Evaluere operationen baseret på operatoren
            case "+":
                return Integer.toString(op1 + op2); // Returnerer resultatet som en streng
            case "-":
                return Integer.toString(op1 - op2);
            case "*":
                return Integer.toString(op1 * op2);
            case "/":
                if (op2 == 0) {
                    throw new ArithmeticException("Cannot divide by zero"); // Kaster en undtagelse hvis forsøg på division med nul
                }
                return Integer.toString(op1 / op2);
            default:
                throw new UnsupportedOperationException("Unsupported operation: " + operator); // Kaster en undtagelse hvis operatoren ikke er understøttet
        }
    }
}
