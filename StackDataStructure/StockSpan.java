import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Stack;

public class StockSpan
 {
    public static int[] stockSpan(int[] input){
        int[] res=new int[input.length];
        Deque<Pair>stack=new ArrayDeque<>();

        for(int i=0;i<input.length;i++){
           int days=1;
           while(!stack.isEmpty()&&stack.peek().value<input[i]){
               days=stack.peek().day+days;
               stack.pop();
           }
           stack.push(new Pair(input[i],days));
           res[i]=days;
        }
return res;
    }
    public static void main(String[] args){
    int[] arr={100, 80, 60, 70, 60, 75, 85};
    // 1 1 1 2 1 4 6
    int[] ans=stockSpan(arr);
    for(int i:ans){
        System.out.print(i+" ");
    }

    }
}
