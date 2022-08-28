/************************************************************************

    Following is the representation of the Singly Linked List node:

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

************************************************************************/

public class Solution {
    public static boolean detectCycle(Node<Integer> head) {
        // Write your code here.
        if(head==null&&head.next==null)return false;
        Node<Integer>slow=head;
        Node<Integer>fast=head;
        
        while(fast!=null&&fast.next!=null&&slow!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }

        }
     return false;
    }
}
