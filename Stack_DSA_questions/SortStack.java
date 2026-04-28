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
            System.out.println("Stack is full Cannot push " + value);
        } else {
            top++;
            stack[top] = value;
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack  emptyCannot pop");
            return -1;
        }
        int value = stack[top];
        top--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack emptyCannot peek");
            return -1;           
        }
        return stack[top];       
    }public boolean isEmpty() {
        return top == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println(" empty Stack");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}


public class SortStack {
   public static void sortStack(Stack input) {
        Stack temp = new Stack(10);   

        while (!input.isEmpty()) {
            int current = input.pop();

            while (!temp.isEmpty() && temp.peek() > current) {
                input.push(temp.pop());
            }

            temp.push(current);
        }

       
        while (!temp.isEmpty()) {
            input.push(temp.pop());
        }
    }public static void main(String[] args) {
        
        Stack s = new Stack(10);

        s.push(9);
        s.push(7);
        s.push(5);
        s.push(3);
        s.push(1);

        System.out.println("Before sorting:");
        s.display();

      
        sortStack(s);

        System.out.println("\n After sorting  in accending order:");
        s.display();
    }
}