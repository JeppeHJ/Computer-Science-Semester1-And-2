package Opgaver.Opg2_LinkedList_Queue;

public class LinkedListQueue implements QueueI {
    private Node head;
    private Node tail;
    private int size;

    public LinkedListQueue() {
        // Initialize both head and tail as null since queue is empty
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(Object newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        newNode.next = null; // newNode is going to be tail, so its next should be null

        if (isEmpty()) {
            // If the queue is empty, both head and tail should point to the new node
            head = newNode;
            tail = newNode;
        } else {
            // Else, the next of the current tail should point to new node
            // And tail should now be the new node
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            return null;
        }

        Node toBeRemoved = head;

        // Update the head to next node in the queue
        head = head.next;
        // Special case when the last node in the queue has been dequeued
        // We need to update tail to null as well to keep our queue state consistent
        if (head == null) {
            tail = null;
        }

        size--;

        // Return the data of the removed node
        return toBeRemoved.data;
    }

    @Override
    public Object getFront() {
        if (!isEmpty()) {
            return head.data;
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    private class Node {
        Node next;
        Object data;
    }
}
