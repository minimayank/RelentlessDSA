import java.util.Scanner;
public class QueueUse {
    public static void main(String[] args) throws QueueEmptyException {
        QueueLL<Integer>queue=new QueueLL<Integer>();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of queries:");
        int queries=sc.nextInt();
        System.out.println("Enter your choice?:\n" +
                "1. Enqeue an element: \n"+
                "2. Dequeue an element: \n"+
                "3. Get the Front of the queue \n"+
                "4. Size() of the Queue.\n"+
                "5. Check Wether it is empty or not?"
        );

        for(int i=0;i<queries;i++){
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice){
                case 1: // Enqueue.
                    System.out.println("Enter the element to be enqued");
                       int data=sc.nextInt();
                       queue.enqueue(data);
                       break;
                case 2: //Dequeue
                    queue.dequeue();
                    break;
                case 3: //front.
                    System.out.println(queue.front());
                    break;
                case 4: //size
                    System.out.println("Queue size is"+queue.size());
                    break;
                case 5: //Is Empty
                    System.out.println("Is my Queue empty?"+queue.isEmpty());
                    break;
                default:
                    System.out.println("Hey please try something else.");
            }
        }
    }
}
