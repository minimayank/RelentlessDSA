/* ██▀███   ██▓▓██   ██▓ ▄▄▄
▓██ ▒ ██▒▓██▒ ▒██  ██▒▒████▄
▓██ ░▄█ ▒▒██▒  ▒██ ██░▒██  ▀█▄
▒██▀▀█▄  ░██░  ░ ▐██▓░░██▄▄▄▄██
░██▓ ▒██▒░██░  ░ ██▒▓░ ▓█   ▓██▒
░ ▒▓ ░▒▓░░▓     ██▒▒▒  ▒▒   ▓▒█░
  ░▒ ░ ▒░ ▒ ░ ▓██ ░▒░   ▒   ▒▒ ░
  ░░   ░  ▒ ░ ▒ ▒ ░░    ░   ▒
   ░      ░   ░ ░           ░  ░
              ░ ░
*/

import java.util.Scanner;
public class SinglyLinkedList {
    public static void printLinkedList(Node<Integer>head){
        if(head==null)return;
        else{
            System.out.print(head.data+" ");
            printLinkedList(head.next);
        }
    }

    public static Node<Integer>takeInput(){
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node<Integer>head=null;
        Node<Integer>tail=head;
        while(data!=-1){
            Node<Integer>newNode=new Node<Integer>(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }
            else{
                tail.next=newNode;
                tail=tail.next; //tail=newNode;
            }
            data=sc.nextInt();
        }
      return head;
    }

    public static Node<Integer>reverseIterative(Node<Integer>head){
        if(head==null||head.next==null)return head;
        else{
            Node<Integer> prev=null,curr=head,next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
            return head;
        }
    }

    public static Node<Integer>merge2sortedLinkedList(Node<Integer>head1,Node<Integer>head2){
        if(head1==null)return head2;
        if(head2==null)return head1;
        else{
            Node<Integer>newHead,temp;
            if(head1.data>=head2.data){newHead=head2;
            head2=head2.next;}
            else{
                newHead=head1;
                head1=head1.next;
            }
            temp=newHead;
            while(head1!=null&&head2!=null){
                if(head1.data>=head2.data){
                    temp.next=head2;
                    head2=head2.next;
                    temp=temp.next; //temp=head2;
                }
                else{
                    temp.next=head1;
                    head1=head1.next;
                    temp=temp.next; //temp=temp.next;

                }
            }
            while(head1!=null){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            while(head2!=null){
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;

            }
            return newHead;
        }
    }

    public static int midPoint(Node<Integer>head){
        if(head==null)return 0;
        else{
            Node<Integer>slow=head;
            Node<Integer>fast=head;
            while(fast.next!=null&&fast!=null&&fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow.data;
        }
    }


    public static Node<Integer>insertAtBeginning(Node<Integer>head){
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node<Integer>newNode=new Node<Integer>(data);
        if(head==null){
            head=newNode;
            return head;
        }
        else{
            newNode.next=head;
            head=newNode;
            return head;
        }


    }

    public static Node<Integer>insertAtTheEnd(Node<Integer>head){
       Scanner sc=new Scanner(System.in);
       int data=sc.nextInt();
       Node<Integer>newNode=new Node<Integer>(data);

        if(head==null){
            head=newNode;
            return head;
        }
        else{
            Node<Integer>temp=head;
            while(temp.next!=null)temp=temp.next;
            temp.next=newNode;
            temp=newNode;
            //temp=temp.next;

            return head;
        }
    }
    public static Node<Integer> deleteFirst(Node<Integer>head){
        if(head==null||head.next==null)return null;
        else{
            head=head.next;
            return head;
        }
    }
    public static Node<Integer>deleteAtEnd(Node<Integer>head){
        if(head==null||head.next==null)return null;
        else{
            Node<Integer>temp=head;
            while(temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            return head;
        }
    }
    public static int length(Node<Integer>head){
        if(head==null)return 0;
        else{
            return 1+length(head.next);
        }

    }
    public static Node<Integer>deletetAPos(Node<Integer>head,int pos){
        // 1_>2_>3_>4
        //POS=2 , 1_>2_>4
        if(head==null)return null;
        if(pos>=length(head)){
            System.out.println("Hey the position is invalid");
            return head;
        }
        else{
            Node<Integer>prev=head;

            Node<Integer>next;
            for(int i=0;i<pos-1;i++){
                prev=prev.next;
            }

            next=prev.next.next;
            prev.next=next;

            return head;
        }

    }
    public static void main(String[] args) {
//         Node head=takeInput();
//         printLinkedList(head);
//         Node revHead=reverseIterative(head);
//        System.out.println();
//         printLinkedList(revHead);
//
//        Node<Integer>head=takeInput();
//        System.out.println(midPoint(head));
//          Node<Integer>head=takeInput();
//          Node<Integer>newHead=insertAtTheEnd(head);
//          printLinkedList(newHead);
//            Node<Integer>head=takeInput();
//            head=deleteAtEnd(head);
//            printLinkedList(head);
        Node<Integer>head=takeInput();
        head=deletetAPos(head,2);
        printLinkedList(head);
    }
}
