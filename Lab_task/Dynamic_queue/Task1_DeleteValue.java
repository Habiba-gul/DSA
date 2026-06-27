// Task1_DeleteValue.java
class Node {
    int data;
    Node link;

    public Node(int d) {
        data = d;
        link = null;
    }
}

class LinkedQueue {
    protected Node front, rear;
    public int size;

    public LinkedQueue() {
        front = rear = null;
        size = 0;
    }

    public void insert(int data) {
        Node nptr = new Node(data);
        if (rear == null) {
            front = rear = nptr;
        } else {
            rear.link = nptr;
            rear = nptr;
        }
        size++;
    }

    public boolean deleteValue(int value) {
        if (front == null) return false;

        if (front.data == value) {
            front = front.link;
            if (front == null) rear = null;
            size--;
            return true;
        }

        Node ptr = front;
        while (ptr.link != null) {
            if (ptr.link.data == value) {
                ptr.link = ptr.link.link;
                if (ptr.link == null) rear = ptr;
                size--;
                return true;
            }
            ptr = ptr.link;
        }
        return false;
    }

    public void display() {
        System.out.print("Queue = ");
        Node ptr = front;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.link;
        }
        System.out.println();
    }
}

public class Task1_DeleteValue {
    public static void main(String[] args) {
        LinkedQueue lq = new LinkedQueue();
        lq.insert(10); lq.insert(20); lq.insert(30); lq.insert(40);
        System.out.println("Before delete:");
        lq.display();

        System.out.println("Deleting 30: " + lq.deleteValue(30));
        lq.display();
    }
}