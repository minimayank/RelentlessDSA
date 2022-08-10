import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class CheckRedundancy {
    public static boolean checkRedundancy(String expression){
        Deque<Character>stack=new ArrayDeque<>();
        if(expression.length()==0)return false;
        else{


            for(int i=0;i<expression.length();i++){
                 Character c=expression.charAt(i);
                 if(c=='(')stack.push(c);
                 else if(c=='*'||c=='-'||c=='+'||c=='/'){
                     stack.push(c);

                 }
                 else if(c==')') {
                    if(stack.peek()=='(')return true;
                     while (stack.peek()=='*'||stack.peek()=='+'||stack.peek()=='-'||stack.peek()=='/'){
                         stack.pop();

                     }
                     stack.pop();
                 }
            }
            return  false;
        }



    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the expression. ");
        String expression=sc.next();
        sc.close();
        System.out.println(checkRedundancy(expression));
    }
}
