import java.util.Scanner;

class Node {
    int data;
    Node link;
 public Node(int d) { 
         data = d; 
        link = null; 
}
}
class LinkedQ {
    Node front, rear;
    int size;
    public LinkedQ() { 
        front = rear = null; 
        size = 0; 
    }
    public void enqueue(int x) {
        Node n = new Node(x);
        if (rear == null) {
            front = rear = n;
        } else { 
            rear.link = n; 
            rear = n; 
        }
        size++;
    }
    public int dequeue() {
        if (front == null) {
            throw new RuntimeException("Queue Empty");
        }
        int val = front.data;
        front = front.link;
        if (front == null) rear = null;
        size--;
        return val;
    }
    public boolean isEmpty() { 
        return front == null; 
    }
}
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedQ q = new LinkedQ();
        System.out.println("Enter numbers (one per line, end with -1):");
        while (true) {
            int x = sc.nextInt();
            if (x == -1) break;
            q.enqueue(x);
            System.out.println("Added: " + x);  
        }
        System.out.println("Enter operator (+ - * /):");
        char op = sc.next().charAt(0);
        if (q.isEmpty()) {
            System.out.println("No numbers entered!");
            return;
        }
        int result = q.dequeue();
        while (!q.isEmpty()) {
            int num = q.dequeue();
            switch (op) {
                case '+': result += num; break;
                case '-': result -= num; break;
                case '*': result *= num; break;
                case '/': 
                    if (num != 0) result /= num; 
                    else System.out.println("Cannot divide by zero!");
                    break;
            }
        }
        System.out.println("Result = " + result);
    }
}