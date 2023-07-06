package Opgaver.Opg2_Stack_CheckParentes;

import Materiale.stack.ArrayStack;
import Materiale.stack.StackI;

public class StackDemo {
    public static void main(String[] args) {
        String test = "(3+{5{99{*}}[23[{67}67]])";
        System.out.println(checkParantes(test));
    }

    public static boolean checkParantes(String s) {
        StackI stack = new ArrayStack(15); // Opretter en stack med en kapacitet på 15
        boolean balancedParentheses; // Variabel til at gemme information om paranteserne er balancerede eller ej
        if (s.length() == 0) {
            balancedParentheses = false; // Hvis strengen er tom, er paranteserne ikke balancerede
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    stack.push(s.charAt(i)); // Hvis der er en åbning parentes, tilføjes den til stacken
                }
                if (s.charAt(i) == ')') {
                    stack.pop(); // Hvis der er en lukning parentes, fjernes den fra stacken
                }
                if (s.charAt(i) == '{') {
                    stack.push(s.charAt(i)); // Hvis der er en åbning krølleparentes, tilføjes den til stacken
                }
                if (s.charAt(i) == '}') {
                    stack.pop(); // Hvis der er en lukning krølleparentes, fjernes den fra stacken
                }
                if (s.charAt(i) == '[') {
                    stack.push(s.charAt(i)); // Hvis der er en åbning firkantparentes, tilføjes den til stacken
                }
                if (s.charAt(i) == ']') {
                    stack.pop(); // Hvis der er en lukning firkantparentes, fjernes den fra stacken
                }
            }
        }
        return stack.isEmpty(); // Returnerer true, hvis stacken er tom og alle parentespar er fjernet, ellers false
    }
}
