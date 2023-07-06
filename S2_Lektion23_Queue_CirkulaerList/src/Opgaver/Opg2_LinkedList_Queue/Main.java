package Opgaver.Opg2_LinkedList_Queue;

public class Main {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();

        System.out.println(queue.isEmpty());  // Prints: true

        queue.enqueue("Element 1");
        queue.enqueue("Element 2");
        queue.enqueue("Element 3");

        System.out.println(queue.size());  // Prints: 3
        System.out.println(queue.getFront());  // Prints: Element 1
        System.out.println(queue.dequeue());  // Prints: Element 1
        System.out.println(queue.size());  // Prints: 2
        System.out.println(queue.getFront());  // Prints: Element 2
        System.out.println(queue.dequeue());  // Prints: Element 2
        System.out.println(queue.isEmpty());  // Prints: false
        System.out.println(queue.dequeue());  // Prints: Element 3
        System.out.println(queue.isEmpty());  // Prints: true
    }

}

