package Opgaver.Opg4_B_LinkedBag;

public class LinkedBag<E> implements Bag<E>{
    private Node first;
    private Node last;
    private int currentSize;
    private int capacity;

    public LinkedBag() {
        this.first = null;
        this.last = null;
        currentSize = 0;
        capacity = 20;
    }

    @Override
    public int getCurrentSize() {
        return currentSize;
    }

    @Override
    public boolean isFull() {
        return currentSize == capacity;
    }

    @Override
    public boolean isEmpty() {
        return currentSize == 0;
    }

    @Override
    public boolean add(E newEntry) {
        if (isFull()) {
            return false;
        }
        if (!isFull()) {
            Node newNode = new Node();
            newNode.data = newEntry;
            if (currentSize == 0) {
                this.first = newNode;
                this.last = newNode;
            } else {
                newNode.prev = last;
                last.next = newNode;
                last = newNode;
            }
            currentSize++;
            return true;
        }
        return false;
    }

    @Override
    public E remove() {
        if (!isEmpty()) {
            Node toBeRemoved = last;
            last = last.prev;
            last.next = null;
            currentSize--;
            return toBeRemoved.data;
        }
        return null;
    }

    @Override
    public boolean remove(E anEntry) {
        boolean found = false;
        if (!isEmpty()) {
            Node current = first;
            while (!found && current != null) {
                if (current.data == anEntry) {
                    found = true;
                } else {
                    current = current.next;
                }
            }
            if (found) {
                // Hvis det er eneste element
                if (currentSize == 1) {
                    first = null;
                    last = null;
                // Hvis det er første element
                } else if (current.prev == null) {
                    first = current.next;
                    first.prev = null;
                // Hvis det er sidste element
                } else if (current.next == null) {
                    last = current.prev;
                    last.next = null;
                // Hvis det er mellem to elementer
                } else {
                    Node nextNode = current.next;
                    Node prevNode = current.prev;
                    prevNode.next = nextNode;
                    nextNode.prev = prevNode;
                }
                currentSize--;
            }
        }
        return found;
    }

    @Override
    public void clear() {
        if (!isEmpty()) {
            Node current = first;
            while (current.next != null) {
                current = current.next;
            }
        }
        currentSize = 0;
    }

    @Override
    public int getFrequencyOf(E anEntry) {
        int count = 0;
        Node current = first;
        while (current != null) {
            if (current.data == anEntry) {
                count++;
            }
            current = current.next;
        }
        return count;
    }

    @Override
    public boolean contains(E anEntry) {
        boolean found = false;
        Node current = first;
        while (!found && current != null) {
            if (current.data == anEntry) {
                found = true;
            }
            current = current.next;
        }
        return found;
    }

    @Override
    public E[] toArray() {
        E[] newArray = (E[]) new Object[currentSize];
        Node current = first;
        int count = 0;
        while (current != null) {
            newArray[count] = current.data;
            count++;
            current = current.next;
        }
        return newArray;
    }

    private class Node {
        Node next;
        Node prev;
        E data;
    }
}
