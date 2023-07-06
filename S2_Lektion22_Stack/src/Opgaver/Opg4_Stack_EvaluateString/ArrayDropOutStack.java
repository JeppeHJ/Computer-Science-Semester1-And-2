package Opgaver.Opg4_Stack_EvaluateString;

import java.util.NoSuchElementException;

public class ArrayDropOutStack implements StackI {
    private Object[] stack;
    private int top;

    /**
     * Constructs an empty stack.
     */
    public ArrayDropOutStack(int antal) {
        top = -1;
        stack = new Object[antal];
    }

    /**
     * Adds an element to the top of the stack.
     *
     * @param element
     *            the element to add
     */
    @Override
    public void push(Object element) {
        if (top < stack.length - 1) {
            top++;
            stack[top] = element;
        } else {
            for (int i = stack.length - 1; i > 0; i--) {
                stack[i] = stack[i - 1];
            }
            stack[top - 1] = element;
        }
    }

    /**
     * Removes the element from the top of the stack.
     *
     * @return the removed element
     */
    @Override
    public Object pop() {
        if (top < 0) {
            throw new NoSuchElementException();
        }
        Object element = stack[top];
        stack[top] = null;
        top--;
        return element;
    }

    /**
     * Returns the element from the top of the stack. The stack is unchanged
     *
     * @return the element from the top of the stack
     */
    @Override
    public Object peek() {
        if (top < 0) {
            throw new NoSuchElementException();
        }
        return stack[top];
    }

    /**
     * The number of elements on the stack.
     *
     * @return the number of elements on the stack
     */
    @Override
    public int size() {
        return top + 1;
    }

    /**
     * Checks whether this stack is empty.
     *
     * @return true if the stack is empty
     */
    @Override
    public boolean isEmpty() {
        return top == -1;
    }

}

