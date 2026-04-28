import java.util.Scanner;

class CharStack {
    private int top;
    private int size;
    private char[] stack;

    public CharStack(int n) {
        size = n;
        stack = new char[size];
        top = -1;
    }

    public void push(char c) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = c;
            System.out.println(c + " pushed");
        }
    }

    public char pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return '\0';
        }
        return stack[top--];
    }

    public char peek() {
        if (top == -1) return '\0';
        return stack[top];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack  empty");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class CharStackDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CharStack cs = new CharStack(10);
        int choice;

        do {
            System.out.println("\nCharStack Menu ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter character: ");
                    char ch = sc.next().charAt(0);
                    cs.push(ch);
                    break;
                case 2:
                    char popped = cs.pop();
                    if (popped != '\0') System.out.println("Popped: " + popped);
                    break;
                case 3:
                    char topChar = cs.peek();
                    if (topChar != '\0') System.out.println("Top element: " + topChar);
                    break;
                case 4:
                    cs.display();
                    break;
                case 5:
                    System.out.println("menue ends");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        sc.close();
    }
}