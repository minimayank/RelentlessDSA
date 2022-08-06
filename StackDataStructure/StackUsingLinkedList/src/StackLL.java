public class StackLL<T> {
    private Node<T> head;
    private int size;

    StackLL() {
    }

    public boolean isEmpty() {
        if (head == null) {
            System.out.println("Hey your stack is empty. ");
            return true;
        } else {
            return false;
        }
    }

 /*
                 ____    ___      _     _          __
 _ __  ___ _ __ / /\ \  |   \ ___| |___| |_ ___   / _|_ _ ___ _ __
| '_ \/ _ \ '_ \ |  | | | |) / -_) / -_)  _/ -_) |  _| '_/ _ \ '  \
| .__/\___/ .__/ |  | | |___/\___|_\___|\__\___| |_| |_| \___/_|_|_|
|_|       |_|   \_\/_/
 _
| |_ ___ _ __
|  _/ _ \ '_ \
 \__\___/ .__/
        |_|


*/


    public T pop(Node<T> head) {
        T res=null;
        if (head == null) return null;

        else {
               res=head.data;
              head=head.next;
        }
        return res;
    }

        public void push (T data){
            Node<T> newNode = new Node<T>(data);
            if (head == null) {
                head = newNode;

            } else {
                newNode.next = head;
                head = newNode;
            }

        }
        public T peek () {   //return the top element of the stack.
            if (head == null) {
                System.out.println("Empty stack");
                return null;
            } else {
                return head.data;
            }

        }
        public int size (Node < T > head) {
            if (head == null) return 0;
            else {
                return 1 + size(head.next);
            }
        }



        }


