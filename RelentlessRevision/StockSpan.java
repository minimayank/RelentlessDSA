package StackProblems;

import java.util.ArrayDeque;
import java.util.Deque;

public class StockSpan {
    public static int[] stockSpan(int[] price) {
        //Your code goes here
        int[] stockSpan=new int[price.length];
        //stockSpan[0]=1;   //uske peeche kuch nahi re bhaiya.
        for(int day=0;day<price.length;day++){
            if(day==0){
                stockSpan[0]=1;
                continue;
            }
            int stockValue=(price[day]);
            Deque<Integer> stack=new ArrayDeque<>();
            for(int i=0;i<=day-1;i++){
                stack.push(price[i]);
            }
            
            int maxNumOfDays=1;

            while((stack.isEmpty()==false)&&stack.peek()<stockValue){
                maxNumOfDays++;
                stack.pop();
            }
            stockSpan[day]=maxNumOfDays;
        }
        return stockSpan;
    }

    public static void main(String[] args) {
        int[] arr={60, 70, 80, 100, 90, 75, 80, 120};
        int[] res=stockSpan(arr);
        for(int i:res){
            System.out.print(i);
        }

    }
}
