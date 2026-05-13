package LinkedList_DSA;

class Node{
    int data;
    Node next;
    Node prev;
    
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoubleList {
    Node head;
    

    // Insert at Head
    void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    // Insert at Tail - Fixed
    void insertAtTail(int data) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        
        current.next = newNode;
        newNode.prev = current;
    }

    // Improved Print
    void printList() {
        Node current = head;
        System.out.print("null <-> ");
        
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" <-> ");
            }
            current = current.next;
        }
        System.out.println(" <-> null");
    }
}

public class DoubleLinkedList{
    public static void main(String[] args) {
        DoubleList list = new DoubleList();
        
        list.insertAtTail(5);
        list.insertAtHead(10);
        list.insertAtHead(30);
        
        list.printList();        // Expected: null <-> 30 <-> 10 <-> 5 <-> null
    }
}