package circular_queue;

class CNode {
    int data;
    CNode next;
    public CNode(int d) { data = d; next = null; }
}
class CircularLinkedQueue {
    CNode rear;  
    public void enqueue(int x) {
        CNode n = new CNode(x);
        if (rear == null) {
            rear = n;
            n.next = n;  
        } else {
            n.next = rear.next;
            rear.next = n;
            rear = n;
        }
    }
    public int dequeue() {
        if (rear == null) throw new RuntimeException("Underflow");
        CNode front = rear.next;
        int val = front.data;
        if (front == rear) rear = null;
        else rear.next = front.next;
        return val;
    }
    public void display() {
        if (rear == null) { System.out.println("Empty"); return; }
        CNode temp = rear.next;
        System.out.print("Circular Queue: ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != rear.next);
        System.out.println();
    }
}
public class task4{
    public static void main(String[] args) {
        CircularLinkedQueue cq = new CircularLinkedQueue();
        cq.enqueue(10); cq.enqueue(20); cq.enqueue(30);
        cq.display();
        System.out.println("Dequeued: " + cq.dequeue());
        cq.display();
    }
}