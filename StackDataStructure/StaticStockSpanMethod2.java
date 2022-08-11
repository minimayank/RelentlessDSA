import java.util.ArrayList;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.HashMap;


public class StaticStockSpanMethod2
 {
     public static class Pair {
         int value;
         int day;
         Pair(int a,int b){
             this.value=a;
             this.day=b;
         }
     }

     public static int[] stockSpan(int[] input){
        int[] res=new int[input.length];

        Deque<Pair>stack=new ArrayDeque<>();

        for(int i=0;i<input.length;i++){
           int days=1;
           while(!stack.isEmpty()&&stack.peek().value<input[i]){
               days+=stack.peek().day;
               stack.pop();
           }
           stack.push(new Pair(input[i],days));
           res[i]=days;
        }
return res;
    }
    public static void main(String[] args){
    int[] arr={60, 70, 80, 100, 90, 75, 80, 120};
    // 1 1 1 2 1 4 6
    int[] ans=stockSpan(arr);
    for(int i:ans){
        System.out.print(i+" ");
    }

    }
}
