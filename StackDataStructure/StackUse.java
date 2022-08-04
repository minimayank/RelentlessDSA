package StackDataStructure;

public class StackUse {
    public static void main(String[] args) throws StackFullException{
//        StackUsingArray stack=new StackUsingArray();
        StackUsingArray stack=new StackUsingArray(3);
        for(int i=0;i<=5;i++) {
          stack.push(i);
        }
        while(!stack.isEmpty()){
        try {
            System.out.println(stack.pop());
        }
        catch (StackEmptyException e){
            System.out.println("HEY our stack is empty");
        }
        }

    }
}
