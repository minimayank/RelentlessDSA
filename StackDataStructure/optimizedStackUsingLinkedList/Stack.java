import java.util.Scanner;
//Note: every sout of head is for debugging the code.
public class Stack {

    //Define the data members
    Node head;
    int size;  //wonder why?   hint: optimized implementation of stack.

    public Stack() {
        //Implement the Constructor
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        //Implement the getSize() function
//        if(head==null)return 0;
//        else{
//            int count=0;
//            while(head!=null){
//                count++;
//                head=head.next;
//            }
//            System.out.println(head);
//            return count;
       return size;
    }


    public boolean isEmpty() {
        //Implement the isEmpty() function
//        System.out.println(head);
////        if(head==null)return true;
////        else{
////            return false;
////        }
//          return (head==null);
       return (size==0);
    }

    public void push(int element) {
        //Implement the push(element) function
        Node newNode=new Node(element);
        if(head==null){
            head=newNode;
            size++;
        }
        else{
            size++;
            newNode.next=head;
            head=newNode;
        }
      //  System.out.println(head);
    }

    public int pop() {
        //Implement the pop() function
        int data=-1;
        if(head==null)return -1;
        else{
            data=head.data;
            head=head.next;
            size--;
        }
        //System.out.println(head);
        return data;

    }

    public int top() {
        //Implement the top() function
        if(head==null)return -1;
        else{
            return head.data;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack s=new Stack();
        int queries=sc.nextInt();
        for(int i=0;i<queries;i++) {
            System.out.println("enter the choice:");
            int choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the data");
                    s.push(sc.nextInt());
                    break;
                case 2:
                    System.out.println(s.pop());
                    break;
                case 3:
                    System.out.println(s.top());
                    break;
                case 4:
                    System.out.println(s.getSize());
                    break;
                case 5:
                    System.out.println(s.isEmpty());
                    break;
                default:
                    System.out.println("Exited!");
                    break;
            }
        }
    }
}
