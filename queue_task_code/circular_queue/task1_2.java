package circular_queue;

class CircularQueue {
    private int[] q;
    private int front, rear, size, capacity;

    public CircularQueue(int cap) {
        capacity = cap;
        q = new int[capacity];
        front = rear = 0;
        size = 0;
    }
    public void enqueue(int x) {
        if (size == capacity) { System.out.println("Overflow"); return; }
        q[rear] = x;
        rear = (rear + 1) % capacity;
        size++;
    }
    public int dequeueFirst() {  
        if (size == 0) { System.out.println("Underflow"); return -1; }
        int val = q[front];
        front = (front + 1) % capacity;
        size--;
        return val;
    }
    public int deleteLast() {  
        if (size == 0) { System.out.println("Underflow"); return -1; }
        rear = (rear - 1 + capacity) % capacity;
        int val = q[rear];
        size--;
        return val;
    }
    public void display() {
        if (size == 0) { System.out.println("Empty"); return; }
        System.out.print("CQ: ");
        for (int i = 0; i < size; i++) {
            System.out.print(q[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}
public class task1_2 {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(10); cq.enqueue(20); cq.enqueue(30);
        cq.display();
        System.out.println("Delete First: " + cq.dequeueFirst());
        cq.display();
        System.out.println("Delete Last: " + cq.deleteLast());
        cq.display();
    }
}