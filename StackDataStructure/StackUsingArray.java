package StackDataStructure;

public class StackUsingArray {
    private int[] data;
    private int top;
    StackUsingArray(){
        this.data=new int[10];
        this.top=-1;//max size of the stack.
    }
    StackUsingArray(int size){
        this.data= new int[size];
        top=-1;
    }
    public boolean isEmpty(){
          return (top==-1);
    }

    public int size(){
        if(top==-1)return 0;
        return top+1;
    }
    public int top() throws StackEmptyException {
        if(size()==0){
            StackEmptyException e=new StackEmptyException();
            throw e;
        }
        return data[top];
    }
    public void push(int element)throws StackFullException{
        if(size()==data.length)
        {
            StackFullException e =new StackFullException();
            throw e;
        }
            top++;
            data[top]=element;

    }
    public int pop() throws  StackEmptyException{
        if(top==-1){
            StackEmptyException e=new StackEmptyException();
            throw  e;

        }
        return data[top--];
    }
}
