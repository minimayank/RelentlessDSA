/*
*  ___                     _           _     _   _                           _
|_ _|_ __  ___  ___ _ __| |_    __ _| |_  | |_| |__   ___    ___ _ __   __| |
 | || '_ \/ __|/ _ \ '__| __|  / _` | __| | __| '_ \ / _ \  / _ \ '_ \ / _` |
 | || | | \__ \  __/ |  | |_  | (_| | |_  | |_| | | |  __/ |  __/ | | | (_| |_
|___|_| |_|___/\___|_|   \__|  \__,_|\__|  \__|_| |_|\___|  \___|_| |_|\__,_( )
                                                                            |/
 ____       _      _          __
|  _ \  ___| | ___| |_ ___   / _|_ __ ___  _ __ ___
| | | |/ _ \ |/ _ \ __/ _ \ | |_| '__/ _ \| '_ ` _ \
| |_| |  __/ |  __/ ||  __/ |  _| | | (_) | | | | | |
|____/ \___|_|\___|\__\___| |_| |_|  \___/|_| |_| |_|

 _                    _
| |__   ___  __ _  __| |
| '_ \ / _ \/ _` |/ _` |
| | | |  __/ (_| | (_| |_
|_| |_|\___|\__,_|\__,_(_)


*
* */
public class QueueLL<T> {
    Node<T> head;
    Node<T>tail;
    int size;
    QueueLL(){

    }
    public  int size(){
        return size;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public T front() throws QueueEmptyException{
        if(head==null){
            QueueEmptyException e=new QueueEmptyException();
            throw e;
        }
        return head.data;
    }
    public void enqueue(T data){

        Node<T> newNode=new Node<>(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=tail.next;//tail=newNode;
        }

    }

    public T dequeue() throws QueueEmptyException{
        if(head==null){
            QueueEmptyException e=new QueueEmptyException();
            throw e;

        }
        else{
            size--;
            T data=head.data;
            head=head.next;
            return data;
        }
    }

}
