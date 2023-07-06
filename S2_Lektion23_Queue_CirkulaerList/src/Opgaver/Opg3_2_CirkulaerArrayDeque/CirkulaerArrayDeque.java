package Opgaver.Opg3_2_CirkulaerArrayDeque;

public class CirkulaerArrayDeque implements DequeI {
    private final int INITIALSIZE = 10;
    private Object[] elements;
    private int head;
    private int tail;
    private int size;

    public CirkulaerArrayDeque() {
        this.head = 0;
        this.tail = 0;
        this.size = 0;
        elements = new Object[INITIALSIZE];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addFirst(Object newElement) {
        growIfNecessary();
        // Move the head index one step to the left (or to the end of the array if at the start)
        head = (head - 1 + elements.length) % elements.length;
        elements[head] = newElement;
        size++;
    }

    @Override
    public void addLast(Object newElement) {
        growIfNecessary();
        // Insert new element at the tail index, then move the tail index one step to the right
        elements[tail] = newElement;
        tail = (tail + 1) % elements.length;
        size++;
    }

    @Override
    public Object removeFirst() {
        if (isEmpty()) {
            return null;
        }
        // Save the element to be removed, then move the head index one step to the right
        Object removedElement = elements[head];
        elements[head] = null;
        head = (head + 1) % elements.length;
        size--;
        return removedElement;
    }

    @Override
    public Object removeLast() {
        if (isEmpty()) {
            return null;
        }
        // Move the tail index one step to the left, then save and remove the last element
        tail = (tail - 1 + elements.length) % elements.length;
        Object removedElement = elements[tail];
        elements[tail] = null;
        size--;
        return removedElement;
    }

    @Override
    public Object getFirst() {
        if (isEmpty()) {
            return null;
        }
        // Just return the first element (at the head index) without modifying the deque
        return elements[head];
    }

    @Override
    public Object getLast() {
        if (isEmpty()) {
            return null;
        }
        // Calculate the index of the last element (one step to the left from the tail index), then return the element
        int lastElementIndex = (tail - 1 + elements.length) % elements.length;
        return elements[lastElementIndex];
    }

    @Override
    public int size() {
        return size;
    }

    private void growIfNecessary() {
        if (size == elements.length) {
            // Create a new array twice as large
            Object[] newElements = new Object[2 * elements.length];

            // Copy the elements from the old array to the new one, maintaining their circular order
            for (int i = 0; i < size; i++) {
                newElements[i] = elements[(head + i) % elements.length];
            }

            // Replace the old array with the new one, and reset the head and tail indexes
            elements = newElements;
            head = 0;
            tail = size;
        }
    }
}
