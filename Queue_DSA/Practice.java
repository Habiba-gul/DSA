class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Queue{
    Node front;
    Node rare;
    Queue(){
        front=null;
        rare=null;
    }
    boolean isEmpty(){
        return front==null;
    }
    void enqueue(int value){
        Node NewNode=new Node(value);
        if (isEmpty()){
            front=NewNode;
            rare=NewNode;
        }
        else{
            front.next=NewNode;
            rare=NewNode;
        }
    }
    void dequeue(int value){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        System.out.println((front.data+ " removed"));
        front=front.next;
        if(front==null){
            rare=null;
        }

    }
    void display(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return;
        }
        Node temp=front;
        System.out.println("front->");
        while (temp!=null) {
            System.out.println(temp.data+ "->");
            temp=temp.next;
        }
        System.out.println("rare");
    }
}


public class Practice {
    public static void main(String[] args) {
        Queue q= new Queue();
        q.enqueue(5);
        q.enqueue(10);
        q.enqueue(15);
        q.dequeue(0);
        q.display();
    }
}
