package double_ended_queue;
class OutputRestrictedDeque {
    private int[] arr;
    private int front, rear, capacity;
    public OutputRestrictedDeque(int size) {
        capacity = size;
        arr = new int[capacity];
        front = rear = -1;
    }
    public void insertFront(int x) {
        if ((front == 0 && rear == capacity-1) || (front == rear+1)) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) front = rear = 0;
        else if (front == 0) front = capacity - 1;
        else front--;
        arr[front] = x;
    }
    public void insertRear(int x) {
        if ((front == 0 && rear == capacity-1) || (front == rear+1)) {
            System.out.println("Overflow");
            return;
        }
        if (front == -1) front = rear = 0;
        else if (rear == capacity-1) rear = 0;
        else rear++;
        arr[rear] = x;
    }
    public int deleteRear() {  
        if (front == -1) { System.out.println("Underflow"); return -1; }
        int val = arr[rear];
        if (front == rear) front = rear = -1;
        else if (rear == 0) rear = capacity - 1;
        else rear--;
        return val;
    }
    public void display() {
        if (front == -1) { System.out.println("Empty"); return; }
        System.out.print("Deque: ");
        int i = front;
        while (true) {
            System.out.print(arr[i] + " ");
            if (i == rear) break;
            i = (i + 1) % capacity;
        }
        System.out.println();
    }
}
public class task1 {
    public static void main(String[] args) {
        OutputRestrictedDeque dq = new OutputRestrictedDeque(5);
        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.display();
        System.out.println("Deleted from rear: " + dq.deleteRear());
        dq.display();
    }
}
