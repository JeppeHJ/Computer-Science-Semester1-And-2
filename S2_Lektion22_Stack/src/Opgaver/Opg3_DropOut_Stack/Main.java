package Opgaver.Opg3_DropOut_Stack;

public class Main {
    public static void main(String[] args) {
        LinkedListDropOutStack stack = new LinkedListDropOutStack(3);
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object o4 = new Object();
        // Tilføj objekter til stakken
        stack.push(o1);
        stack.push(o2);
        stack.push(o3);
        System.out.println(stack.size());

        // Stakken er fyldt, det første objekt "Objekt 1" bliver fjernet
        stack.push(o4);
        System.out.println(stack.size());

        // Udskriv øverste objekt uden at fjerne det
        System.out.println(stack.peek()); // Forventet output: Objekt 4

        // Fjern øverste objekt fra stakken
        System.out.println(stack.pop()); // Forventet output: Objekt 4

        // Tjek om stakken er tom
        System.out.println(stack.isEmpty()); // Forventet output: false

        // Tjek størrelsen af stakken
        System.out.println(stack.size()); // Forventet output: 2
    }
}

