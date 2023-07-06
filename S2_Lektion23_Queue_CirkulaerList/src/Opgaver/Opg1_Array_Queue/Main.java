package Opgaver.Opg1_Array_Queue;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue();

        // Test isEmpty on an empty queue
        System.out.println(queue.isEmpty()); // Expected: true

        // Add elements to the queue
        queue.enqueue("Element 1");
        queue.enqueue("Element 2");
        queue.enqueue("Element 3");

        // Test size after adding elements
        System.out.println(queue.size()); // Expected: 3

        // Test getFront
        System.out.println(queue.getFront()); // Expected: "Element 1"

        // Test dequeue
        System.out.println(queue.dequeue()); // Expected: "Element 1"
        System.out.println(queue.size()); // Expected: 2

        // Test getFront after dequeue
        System.out.println(queue.getFront()); // Expected: "Element 2"

        // Test isEmpty after removing and adding elements
        System.out.println(queue.isEmpty()); // Expected: false

        // Test dequeue until the queue is empty
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.isEmpty()); // Expected: true

        // Test getFront and dequeue on an empty queue
        System.out.println(queue.getFront()); // Expected: null
        System.out.println(queue.dequeue()); // Expected: null
    }
}
