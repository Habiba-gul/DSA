import java.util.Scanner;
public class stack_struct {
    static int[] stack;
    static int top=-1;
    static int size;

    static void push(int value){
      if(isFull()){
        System.out.println("Stack is Full! cant push");
        return;
      }
      top++;
      stack[top]=value;
      System.out.println(value+"pushed on stack");
    }

    static void pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        System.out.println(stack[top]+"popped from stack");
        top--;
    }
    static void peek(){
        if(isEmpty()){
            System.out.println("stack is empty ! no element");
            return;
        }
        System.out.println("top elemnt is "+stack[top]);

    }

    static boolean isEmpty(){
        return top==-1;

    }
    static boolean isFull(){
        return top==size-1;
    }

 static int getsize(){
    return top +1;
 }
static void display(){
    if(isEmpty()){
        System.out.println("Stack is Empty!");
        return;
    }
    System.out.println("top ->");
    for(int i=top; i>=0; i--){
        System.out.println(stack[i]+"->");
    }
    System.out.println("Bottom");
    System.out.println("top index: "+ top);
    System.out.println("current size :"+getsize()+"/"+size);
}


    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter you stack size");
        size=sc.nextInt();
        stack=new int[size];
        int choice;
        do{
            System.out.println("\n Stack menu");
            System.out.println("1-push");
            System.out.println("2-pop");
            System.out.println("3-peek");
            System.out.println("4-empty");
            System.out.println("5-full"); 
            System.out.println("6-size");
            System.out.println("7-display");
            System.out.println("0-exit"); 
            System.out.println("enter your choice");
            choice=sc.nextInt();
              
            switch (choice) {
                case 1:
                    System.out.println("enter value to push");
                    int val=sc.nextInt();
                    push(val);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    peek();
                    break;
                case 4:
                    System.out.println(isEmpty()?"stack is empty":"stack is not empty ");
                    break;
                case 5: 
                System.out.println(isFull()?"satck is full":"stack is not full");
                break;
                case 6:
                    System.out.println("cureent size :"+ getsize());
                    break;
                case 7:
                    display();
                    break;
                    case 0:
                    System.out.println("existing");
                    break;
                default:
                System.out.println("invalid choice!");
                
            }

        }while (choice!=0);
            
        sc.close(); 
    }

    
}
