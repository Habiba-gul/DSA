package LinkedList_DSA;

class LinkedList {              // ← OUTER CLASS
    Node head;                  // field: points to first node

    // ↓ INNER CLASS (defined inside the outer class)
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Methods of the outer class
    void insertAtHead(int data) {
        Node newNode = new Node(data);  // creates inner class object
        newNode.next = head;
        head = newNode;
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

// --- MAIN ---
public class inner_outter_class {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();  // outer class object
        list.insertAtHead(30);
        list.insertAtHead(20);
        list.insertAtHead(10);
        list.print();   // 10 -> 20 -> 30 -> null
    }
}