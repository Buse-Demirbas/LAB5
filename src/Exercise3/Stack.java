package Exercise3;

/**
 * Stack.java
 *
 * Your Name:        Buse Demirbaş
 * Your Student ID:  240444050
 * Your Date:        16.11.2026
 */
public class Stack {

    private char[] items;
    private int top;

    public Stack(int capacity) {
        items = new char[capacity];
        top = -1;
    }

    public void push(char value) {
        if (isFull()) {
            System.out.println("Stack is full!");
            return;
        }
        top++;
        items[top] = value;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return '\0';
        }
        char removedChar = items[top];
        top--;
        return removedChar;
    }

    public char peek() {
        if (isEmpty()) {
            return '\0';
        }
        return items[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == items.length - 1;
    }
}
