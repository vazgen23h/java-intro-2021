class Stack {
    int maxSize;
    int[] stackArray;
    int top;

    Stack(int m) {
        this.maxSize = m;
        stackArray = new int[m];
        top = -1;
    }

    public void push(int element) {
        stackArray[++top] = element;
    }

    public int pop() {
        return stackArray[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}


public class StackDemo {
    public static void main(String[] args) {
        Stack myStack = new Stack(10);

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);

        myStack.pop();

        System.out.print("New stack: ");
        while (myStack.isEmpty() == false) {
            int result = myStack.pop();
            System.out.print(result + " ");
        }
    }
}