package LinkedList_DSA;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;}}

    class singleList{
        Node head;
        void insertAtHead(int data){
            Node newNode=new Node(data);
            newNode.next=head;
            head=newNode;
        }
        void insertAtTail(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node current=head;
            while (current.next!=null) {
                current=current.next;
            }
            current.next=newNode;
}
        void deleteNode(int data){
            if(head==null){
                return;
            }
            if(head.data==data){
                head=head.next;
                return;
            }
            Node current=head;
            while(current.next!=null && current.next.data!=data){
                current=current.next;
            }
            if(current.next!=null){
                 current.next=current.next.next;
            }
        }
        void printlist(){
            Node current=head;
            while(current!=null){
                System.out.print(current.data+ "->");
                current=current.next;
            }
            System.out.println(("null"));
        }

    }
    

public class Single_list {
    
         public static void main(String[] args) {
            singleList list=new singleList();
            list.insertAtHead(5);
            list.insertAtHead(10);
            list.insertAtHead(20);
            list.insertAtTail(30);
            list.insertAtTail(40);
            list.printlist();
            list.deleteNode(30);
            list.printlist();
            
         }
}
