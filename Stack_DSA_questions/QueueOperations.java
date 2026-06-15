// COMSATS University Islamabad - Abbottabad Campus
// Department of Computer Science | Lab Mid | Data Structures
// Class: BS(SE)-4A | Instructor: Ms. Iqra Sarfraz
// Q2: Queue Operations - Enqueue, Dequeue, Display Front

import java.util.Scanner;

public class QueueOperations {

    // ─────────────────────────────────────────────
    // Queue class implemented manually using an array
    // FIFO → First In, First Out
    // front: points to the first element (for dequeue/display)
    // rear:  points to the last element (for enqueue)
    // ─────────────────────────────────────────────
    static class Queue {
        int[] data;
        int front, rear, size, capacity;

        // Constructor: initialize empty queue with given capacity
        Queue(int capacity) {
            this.capacity = capacity;
            data = new int[capacity];
            front = 0;
            rear = -1;   // -1 means nothing has been added yet
            size = 0;
        }

        // ── Check if queue is FULL ──
        boolean isFull() {
            return size == capacity;
        }

        // ── Check if queue is EMPTY ──
        boolean isEmpty() {
            return size == 0;
        }

        // ─────────────────────────────────────────
        // OPERATION 1: ENQUEUE — Insert at rear
        // New elements always enter from the back
        // ─────────────────────────────────────────
        void enqueue(int element) {
            if (isFull()) {
                System.out.println("  ❌ Queue is FULL! Cannot enqueue " + element);
                return;
            }
            rear++;                  // Move rear pointer forward
            data[rear] = element;    // Place element at rear
            size++;
            System.out.println("  ✔ Enqueued: " + element);
        }

        // ─────────────────────────────────────────
        // OPERATION 2: DEQUEUE — Remove from front
        // Elements always leave from the front
        // ─────────────────────────────────────────
        int dequeue() {
            if (isEmpty()) {
                System.out.println("  ❌ Queue is EMPTY! Cannot dequeue.");
                return -1;  // Sentinel value for empty queue
            }
            int removed = data[front];  // Save element to return
            front++;                    // Move front pointer forward
            size--;
            System.out.println("  ✔ Dequeued: " + removed);
            return removed;
        }

        // ─────────────────────────────────────────
        // OPERATION 3: DISPLAY FRONT — Peek at front
        // Shows the front element without removing it
        // ─────────────────────────────────────────
        void displayFront() {
            if (isEmpty()) {
                System.out.println("  ❌ Queue is EMPTY! No front element.");
                return;
            }
            System.out.println("  👁 Front element: " + data[front]);
        }

        // ── Helper: Display entire queue contents ──
        void displayQueue() {
            if (isEmpty()) {
                System.out.println("  Queue: [ EMPTY ]");
                return;
            }
            System.out.print("  Queue (front → rear): [ ");
            for (int i = front; i <= rear; i++) {
                System.out.print(data[i]);
                if (i < rear) System.out.print(" → ");
            }
            System.out.println(" ]");
        }
    }

    // ─────────────────────────────────────────────
    // MAIN METHOD — Interactive Menu
    // ─────────────────────────────────────────────
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue(10);  // Queue with capacity of 10

        System.out.println("=================================================");
        System.out.println("  Q2: Queue Operations - Data Structures");
        System.out.println("=================================================");

        int choice;

        do {
            // ── Display menu ──
            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("  1. Enqueue  (Insert element)");
            System.out.println("  2. Dequeue  (Delete element)");
            System.out.println("  3. Display Front element");
            System.out.println("  4. Display entire Queue");
            System.out.println("  0. Exit");
            System.out.println("----------------------");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1: // ── ENQUEUE ──
                    System.out.println("\n[ENQUEUE]");
                    System.out.print("  Enter element to enqueue: ");
                    int elem = sc.nextInt();
                    q.enqueue(elem);
                    q.displayQueue();
                    break;

                case 2: // ── DEQUEUE ──
                    System.out.println("\n[DEQUEUE]");
                    q.dequeue();
                    q.displayQueue();
                    break;

                case 3: // ── DISPLAY FRONT ──
                    System.out.println("\n[DISPLAY FRONT]");
                    q.displayFront();
                    break;

                case 4: // ── DISPLAY FULL QUEUE ──
                    System.out.println("\n[FULL QUEUE]");
                    q.displayQueue();
                    break;

                case 0:
                    System.out.println("\n  Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("  ⚠ Invalid choice. Please enter 0-4.");
            }

        } while (choice != 0);

        sc.close();
    }
}