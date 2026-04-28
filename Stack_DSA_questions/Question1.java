class Stack {
    private int top;
    private int size;
    private int[] stack;

    public Stack(int arraySize) {
        size = arraySize;
        stack = new int[size];
        top = -1;
    }
    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is fullCannot push " + value);
        } else {
            top++;
            stack[top] = value;
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty Cannt pop");
            return -1;
        }
        int value = stack[top];
        top--;
        return value;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
public class Question1 {
    public static void main(String[] args) {
        
        Stack s = new Stack(10);   

        
        for (int i = 1; i <= 10; i++) {
            s.push(i);
        }

        System.out.println("Stack after pushing 1 to 10:");
        s.display();

        System.out.println("\n Popp all elements one by one:");
        while (!s.isEmpty()) {
            int deleted = s.pop();        
            System.out.println("Deleted: " + deleted);
        }
    }
}
