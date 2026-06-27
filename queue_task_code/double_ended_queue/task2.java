package double_ended_queue;
class DNode {
    int data;
    DNode next, prev;
    public DNode(int d) { data = d; next = prev = null; }
}
class DequeLinked {
    DNode front, rear;

    public void insertFront(int x) {
        DNode n = new DNode(x);
        if (front == null) front = rear = n;
        else {
            n.next = front;
            front.prev = n;
            front = n;
        }
    }
    public void insertRear(int x) {
        DNode n = new DNode(x);
        if (rear == null) front = rear = n;
        else {
            n.prev = rear;
            rear.next = n;
            rear = n;
        }
    }
    public int deleteFront() {
        if (front == null) throw new RuntimeException("Underflow");
        int val = front.data;
        front = front.next;
        if (front == null) rear = null;
        else front.prev = null;
        return val;
    }
    public int deleteRear() {
        if (rear == null) throw new RuntimeException("Underflow");
        int val = rear.data;
        rear = rear.prev;
        if (rear == null) front = null;
        else rear.next = null;
        return val;
    }
    public void display() {
        DNode ptr = front;
        System.out.print("Deque: ");
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
        System.out.println();
    }
}
public class task2 {
    public static void main(String[] args) {
        DequeLinked dq = new DequeLinked();
        dq.insertRear(10);
        dq.insertRear(20);
        dq.insertFront(5);
        dq.display();
        System.out.println("Delete Front: " + dq.deleteFront());
        dq.display();
    }
}