import java.util.Stack;
class Node {
    int data; Node link;
    public Node(int d) { data = d; link = null; }
}
class linkedQueue {
    Node front, rear;
    public linkedQueue() { front = rear = null; }
    public void insert(int x) {
        Node n = new Node(x);
        if (rear == null) front = rear = n;
        else { rear.link = n; rear = n; }
    }
    public void displayLIFO() {
        Stack<Integer> stack = new Stack<>();
        Node ptr = front;
        while (ptr != null) {
            stack.push(ptr.data);
            ptr = ptr.link;
        }
        System.out.print("LIFO Order: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
public class task3 {
    public static void main(String[] args) {
        linkedQueue q = new linkedQueue();
        q.insert(10); q.insert(20); q.insert(30); q.insert(40);
        q.displayLIFO();
    }
}