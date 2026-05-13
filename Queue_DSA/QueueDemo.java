import java.util.Scanner;

 class MyQueue {

    public static int nSize = 5;
    int[] arr = new int[nSize];
    int head = 0;
    int tail = -1;

    // Check Empty
    public boolean isEmpty() {
        if (tail < 0)
            return true;
        else
            return false;
    }

    // Check Full
    public boolean isFull() {
        if (tail == nSize - 1)
            return true;
        else
            return false;
    }

    // Insert
    public void enqueue(int value) {
        if (isFull())
            System.out.println("Queue is full");
        else
            arr[++tail] = value;
    }

    // Delete
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -9999;
        } else {
            int value = arr[head];
            moveArray();
            return value;
        }
    }

    // Peek
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return -9999;
        } else
            return arr[head];
    }

    // Size
    public int size() {
        return (tail + 1);
    }

    // Display Queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
        } else {
            for (int i = head; i <= tail; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    // Shift elements left
    private void moveArray() {
        for (int i = 0; i < tail; i++) {
            arr[i] = arr[i + 1];
        }
        tail--;
    }
}

public class QueueDemo {

    public static void main(String[] args) {

        MyQueue que = new MyQueue();
        java.util.Scanner sc = new java.util.Scanner(System.in);

        int choice, value;

        do {
            System.out.println("\n--- QUEUE MENU ---");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek (Front)");
            System.out.println("4. Display");
            System.out.println("5. Check Empty");
            System.out.println("6. Check Full");
            System.out.println("7. Size");
            System.out.println("8. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Value: ");
                    value = sc.nextInt();
                    que.enqueue(value);
                    break;

                case 2:
                    int x = que.dequeue();
                    if (x != -9999)
                        System.out.println("Deleted: " + x);
                    break;

                case 3:
                    System.out.println("Front: " + que.front());
                    break;

                case 4:
                    que.display();
                    break;

                case 5:
                    System.out.println(que.isEmpty());
                    break;

                case 6:
                    System.out.println(que.isFull());
                    break;

                case 7:
                    System.out.println("Size: " + que.size());
                    break;

                case 8:
                    System.out.println("Program End");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 8);
    }
}