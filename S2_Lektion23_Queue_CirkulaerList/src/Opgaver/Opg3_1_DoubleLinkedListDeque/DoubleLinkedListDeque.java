package Opgaver.Opg3_1_DoubleLinkedListDeque;

public class DoubleLinkedListDeque implements DequeI {
    private Node head;
    private Node tail;
    private int size;

    public DoubleLinkedListDeque() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addFirst(Object newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        if (isEmpty()) {
            head = newNode;
            head.prev = null;
            tail = newNode;
        } else {
            Node oldHead = head;
            head = newNode;
            head.next = oldHead;
            oldHead.prev = head;
        }
        size++;
    }

    @Override
    public void addLast(Object newElement) {
        Node newNode = new Node();
        newNode.data = newElement;
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            Node oldTail = tail;
            tail = newNode;
            tail.prev = oldTail;
            oldTail.next = tail;
        }
        size++;
    }

    @Override
    public Object removeFirst() {
        if (isEmpty()) {
            return null;
        }
            Node toBeRemoved = head;
            head = head.next;
            head.prev = null;
            size--;
        return toBeRemoved;
    }

    @Override
    public Object removeLast() {
        if (isEmpty()) {
            return null;
        }
        Node toBeRemoved = tail;
        tail = tail.prev;
        tail.next = null;
        size--;
        return toBeRemoved;
    }

    @Override
    public Object getFirst() {
        if (!isEmpty()) {
            return head; }
        return null;
    }

    @Override
    public Object getLast() {
        if (!isEmpty()) {
            return tail;
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }
    private class Node {
        Node next;
        Node prev;
        Object data;
    }
}
