public class Stack {

    // Maximum size of the stack
    private int maxSize;

    //Index of the top element
    private int top;

    //Array to store the elements
    private Object[] stackArray;

    public Stack(int size) {
        maxSize = size;
        stackArray = new Object[maxSize];

        //Initializing top to -1 (empty stack)
        top = -1;
    }

    public void push(Object value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        stackArray[++top] = value;
    }

    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return null;  // Return null for empty stack
        }
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        //doing the PUSH operation
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Orange");

        //doing the POP operation
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        //Checking if Stack isEmpty we know 1 element is present there
        System.out.println("Is stack empty? :" + stack.isEmpty());
    }
}
