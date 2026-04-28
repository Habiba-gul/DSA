class stack{
    int top;
    int size;
    int[] stack;

    
    stack(int size) {
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    void push(int value) {

        // Overflow 
        if (top == size - 1) {
            System.out.println("Stack Overflow, Cannot insert " + value);
        }
        else {
            top++;
            stack[top] = value;
            System.out.println(value + " inserted into stack");
        }
    }
     void pop() {

        // Underflow
        if (top == -1) {
            System.out.println("Stack Underflow ,Stack is empty");
        }
        else {
            System.out.println(stack[top] + " deleted from stack");
            top--;
        }
    }
    void display() {

        if (top == -1) {
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Stack elements :");

            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

}
public class Question2_overflow_underflow{
    public static void main(String[] args) {
        stack s = new stack(5);

       
        s.push(11);
        s.push(14);
        s.push(16);
         s.push(19);
        s.push(21);

       
        s.push(4);

        System.out.println();

        s.display();

        System.out.println();

         s.pop();
        s.pop();
        s.pop();

        
        s.pop();
    }
}
