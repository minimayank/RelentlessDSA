package SinglyLinkedList;

import java.util.Scanner;

public class SinglyLinkedList {
    public static Node<Integer> takeInput() {
        Node<Integer> head = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) head = newNode;
            else {
                Node<Integer> temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> inputInNtime() {
        Node<Integer> head = null, tail = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
                //or, tail=tail.next.
            }
            data = sc.nextInt();
        }
        return head;
    }

    public static void print(Node<Integer> head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        print(head.next);
    }

    public static Node<Integer> takeInputNSquare() {
        Node<Integer> head = null;
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while (data != -1) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
            } else {
                Node<Integer> temp = head;
                while (temp.next != null) {
                    temp = temp.next;

                }
                temp.next = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }

    //
    // Let's recapitulate the concepts of insertion in a singlyLinkedList.
    //1. Insert an element at the beginning of the list.
    public static Node<Integer> insertAtTheBeginning(Node<Integer> head, int data) {
        Node<Integer> newNode = new Node<Integer>(data);
        if (head == null) {

            head = newNode;
            return head;
        } else {
            //the list  is not empty.
            Node<Integer> temp = head;
            newNode.next = head;
            head = newNode;
            return head;
        }

    }

    //2. Insert At the end.
    public static Node<Integer> insertAtTheEnd(Node<Integer> head, int data) {
        Node<Integer> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return head;
        } else {
            Node<Integer> tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = newNode;

        }
        return head;
    }

    //3. Inser After a node
    public static Node<Integer> insertAfterANode(Node<Integer> head, int data, int position) {
        Node<Integer> newNode = new Node<Integer>(data);
        if (head == null) {
            head = newNode;
            return head;
        } else {
            if (position < 0 || position > length(head)) {
                System.out.println("hey we can't insert here. It's an invalid position. ");
                return head;
            } else {
                Node<Integer> temp = head;
                for (int i = 0; i < position - 1; i++) {
                    temp = temp.next;
                }
                Node<Integer> ref = temp.next;
                temp.next = newNode;
                newNode.next = ref;
            }

        }
        return head;
    }

    public static int length(Node<Integer> head) {
        if (head == null) return 0;
        return 1 + length(head.next);
    }

    //
    public static Node<Integer> insertBeforeANode(Node<Integer> head, int data, int position) {
        int length = length(head);
        if (position < 0 || position > length) {
            System.out.println("Hey there, We can't insert an element before that.\n INVALID POSITION");
            return head;
        }
        Node<Integer> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return head;
        } else {

            if (position == 1) {
                newNode.next = head;
                head = newNode;
                return head;
            } else {
                Node<Integer> temp = head;
                for (int i = 1; i < position; i++) {
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;

            }

        }
        return head;
    }

    /*
    *
    *
    *
    *
    *
    *
//    * ____       _      _            _      _   _           _
//|  _ \  ___| | ___| |_ ___     / \    | \ | | ___   __| | ___
//| | | |/ _ \ |/ _ \ __/ _ \   / _ \   |  \| |/ _ \ / _` |/ _ \
//| |_| |  __/ |  __/ ||  __/  / ___ \  | |\  | (_) | (_| |  __/
//|____/ \___|_|\___|\__\___| /_/   \_\ |_| \_|\___/ \__,_|\___|
//

    *
    *
    *
    *
    *
    * */
    public static Node<Integer> reverse(Node<Integer> head) {
        if (head == null || head.next == null) return head;
        Node<Integer> newHead = reverse(head.next);
        Node<Integer> temp = newHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;

        return newHead;
    }

    /*
               _ __ ___ (_) __| |_ __   ___ (_)_ __ | |_
    | '_ ` _ \| |/ _` | '_ \ / _ \| | '_ \| __|
    | | | | | | | (_| | |_) | (_) | | | | | |_
    |_| |_| |_|_|\__,_| .__/ \___/|_|_| |_|\__|
                      |_|

    * * */
    public static int midPoint(Node<Integer> head) {
        if (head == null || head.next == null) return 0;
        Node<Integer> slow = head, fast = head;
        int pos = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            pos++;
        }
        System.out.println("mid point of the linked list has:" + slow.data);
        return pos;
    }

    /*
    *
    *    _ __ ___   ___ _ __ __ _  ___   ___  ___  _ __| |_ ___  __| | | | |
    | '_ ` _ \ / _ \ '__/ _` |/ _ \ / __|/ _ \| '__| __/ _ \/ _` | | | |
    | | | | | |  __/ | | (_| |  __/ \__ \ (_) | |  | ||  __/ (_| | | | |
    |_| |_| |_|\___|_|  \__, |\___| |___/\___/|_|   \__\___|\__,_| |_|_|
                        |___/
    error: Unable to open unive
    *
    * */
    public static Node<Integer> merge2SortedList(Node<Integer> head1, Node<Integer> head2) {

        if (head1 == null) return head2;
        if (head2 == null) return head1;

        Node<Integer> t1 = head1, t2 = head2;
        Node<Integer> newHead = null;
        if (t1.data >= t2.data) {
            newHead = t2;
            t2 = t2.next;
        } else {
            newHead = t1;
            t1 = t1.next;
        }
        Node<Integer> temp = newHead;
        while (t1 != null && t2!= null) {
            if (t1.data >= t2.data) {
                temp.next = t2;
                t2=t2.next;
                temp=temp.next;

            } else {
                temp.next = t1;
                t1=t1.next;
                temp=temp.next;
            }
        }
        if (t2!= null) {
            temp.next = t2;
        }
        if (t1!= null) {
            temp.next = t1;
        }

      return newHead;
    }
    public static boolean isPalindrome(Node<Integer>head){
        if(head==null||head.next==null)return true;
        else{
          Node<Integer>res=reverseLL(head);
          Node<Integer>temp=head;
          while(temp.next!=null){
              if(res.data!=temp.data)return false;
              else{
                  res=res.next;
                  temp=temp.next;
              }
          }
          return true;
        }
    }
    public static int midPointRevision(Node<Integer>head){
        if(head.next==null||head==null)return 0;
        else{
            Node<Integer>slow=head,fast=head;
            int pos=0;
            while(fast!=null&&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                pos++;
            }
            return pos;
        }

    }

    public static Node<Integer> reverseLL(Node<Integer>head){
        if(head==null||head.next==null)return head;
        Node<Integer>prev=null;
        Node<Integer>curr=head;
        Node<Integer>temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }return prev;
    }
    public static void main(String[] args) {
//        Node<Integer> head = takeInputNSquare();
//        print(head);
//        System.out.println();
//       head=  insertAtTheBeginning(head,100);
//       head=insertAtTheEnd(head,100);
        // head=insertBeforeANode(head,100,4);
//         head=reverse(head);
        //print(head);
//        System.out.println(midPoint(head));

//

        Node<Integer>head=inputInNtime();
       Node<Integer>rev=reverseLL(head);
       print(rev);
        System.out.println(isPalindrome(rev));
    }
}
