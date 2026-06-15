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
boolean isEmpty() {
    return front==null;
}
 void enqueue(int value){
    Node Newnode=new Node(value);
    if (isEmpty()){
        front=Newnode;
        rare=Newnode;
    
    }else{
        rare.next=Newnode;
        rare=Newnode;
    }

 }
 void dequeue(){
    if (isEmpty()){
        System.out.println("queue is empty");
        return;
    }
    System.out.println(front.data+" removed ");
      front=  front.next;
      if (front==null){
        rare=null;
      }
    
 }
 void display(){
    if(isEmpty()){
        System.out.println("queue is empty ");
        return;
    }
    Node temp=front;
    System.out.println("Front-> ");
    while (temp!=null) {
        System.out.println(temp.data +"->");
        temp=temp.next;
        
    }
System.out.println("Rear ");

 }
    
}
public class queue_struct {
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(60);
        q.enqueue(25);
        q.dequeue();
        q.enqueue(10);
        q.dequeue();
        
        q.enqueue(47);
        q.enqueue(39);
        q.dequeue();
        q.dequeue();

        
    }
}
