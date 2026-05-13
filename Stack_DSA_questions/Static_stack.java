class StaticStack {

    int top = -1;
    int size = 5;

    int arr[] = new int[size];

    // Push Function
    void push(int value) {

        if(top == size - 1) {
            System.out.println("Stack Overflow");
        }
        else {
            top++;
            arr[top] = value;
        }
    }

    // Pop Function
    void pop() {

        if(top == -1) {
            System.out.println("Stack Underflow");
        }
        else {

            System.out.println("Removed: " + arr[top]);

            top--;
        }
    }

    // Display Function
    void display() {

        for(int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        StaticStack s = new StaticStack();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack Elements:");

        s.display();

        s.pop();
    }
}