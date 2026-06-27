package circular_queue;

class CircularQueueValue {
    private int[] q;
    private int front, rear, size, capacity;

    public CircularQueueValue(int cap) {
        capacity = cap; q = new int[cap]; front = rear = 0; size = 0;
    }
    public void enqueue(int x) {
        if (size == capacity) return;
        q[rear] = x;
        rear = (rear + 1) % capacity;
        size++;
    }
    public boolean deleteValue(int val) {
        if (size == 0) return false;
        int i = front;
        for (int count = 0; count < size; count++) {
            if (q[i] == val) {
                // Shift elements
                while (count < size - 1) {
                    q[i] = q[(i + 1) % capacity];
                    i = (i + 1) % capacity;
                    count++;
                }
                rear = (rear - 1 + capacity) % capacity;
                size--;
                return true;
            }
            i = (i + 1) % capacity;
        }
        return false;
    }
    public void display() {
        System.out.print("CQ: ");
        for (int i = 0; i < size; i++)
            System.out.print(q[(front + i) % capacity] + " ");
        System.out.println();
    }
}
public class task3 {
    public static void main(String[] args) {
        CircularQueueValue cq = new CircularQueueValue(5);
        cq.enqueue(10); cq.enqueue(20); cq.enqueue(30); cq.enqueue(40);
        cq.display();
        System.out.println("Delete 30: " + cq.deleteValue(30));
        cq.display();
    }
}