import java.util.Scanner;

class QueueArray {

    int arr[];
    int front;
    int rear;
    int size;

    // Constructor
    QueueArray(int size) {

        this.size = size;
        arr = new int[size];

        front = -1;
        rear = -1;
    }

    // Check Empty
    boolean isEmpty() {

        return front == -1;
    }

    // Check Full
    boolean isFull() {

        return rear == size - 1;
    }

    // Insert Function
    void insert(int value) {

        if (isFull()) {

            System.out.println("Queue is Full");
        }

        else {

            // First Element
            if (front == -1) {

                front = 0;
            }

            rear++;

            arr[rear] = value;

            System.out.println(value + " inserted");
        }
    }

    // Delete Function
    void delete() {

        if (isEmpty()) {

            System.out.println("Queue is Empty");
        }

        else {

            System.out.println(arr[front] + " deleted");

            // Last Element Case
            if (front == rear) {

                front = -1;
                rear = -1;
            }

            else {

                front++;
            }
        }
    }

    // Peek Function
    void peek() {

        if (isEmpty()) {

            System.out.println("Queue is Empty");
        }

        else {

            System.out.println("Front Element = " + arr[front]);
        }
    }

    // Display Function
    void display() {

        if (isEmpty()) {

            System.out.println("Queue is Empty");
        }

        else {

            System.out.print("Queue: ");

            for (int i = front; i <= rear; i++) {

                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }
    }

    // Size Function
    void size() {

        if (isEmpty()) {

            System.out.println("Queue Size = 0");
        }

        else {

            System.out.println("Queue Size = " + (rear - front + 1));
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        QueueArray q = new QueueArray(5);

        int choice, value;

        do {

            System.out.println("\n--- QUEUE MENU ---");

            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Peek");
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

                    q.insert(value);

                    break;

                case 2:

                    q.delete();

                    break;

                case 3:

                    q.peek();

                    break;

                case 4:

                    q.display();

                    break;

                case 5:

                    System.out.println(q.isEmpty());

                    break;

                case 6:

                    System.out.println(q.isFull());

                    break;

                case 7:

                    q.size();

                    break;

                case 8:

                    System.out.println("Program Ended");

                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 8);
    }
}