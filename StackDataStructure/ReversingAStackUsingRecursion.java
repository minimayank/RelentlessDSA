import java.util.Stack;

public class Solution {
    public static void insertAtBottom(Stack<Integer>s,int temp){
        if(s.isEmpty()){
            s.push(temp);
            return;
        }
        int prevData =s.peek();
        s.pop();
        insertAtBottom(s,temp);
        s.push(prevData);
    }
    
	public static void reverseStack(Stack<Integer> stack) {
		// write your code here
       if(stack.size()==1||stack.size()==0)return;
        int temp=stack.peek();
        stack.pop();
        reverseStack(stack);
	    insertAtBottom(stack,temp);
    }

}
