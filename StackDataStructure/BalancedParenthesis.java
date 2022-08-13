import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
public class BalancedParenthesis {
    public static boolean matching(Character a,Character b){
        return (a=='('&&b==')'||
                a=='{'&&b=='}'||
                a=='['&&b==']');
    }
    public static boolean isBalanced(String expression){
        if(expression.length()%2!=0)return false;
        if(expression.length()==0)return true;
        else{
            Deque<Character>stack=new ArrayDeque<>();
            for(int i=0;i<expression.length();i++){
                Character c=expression.charAt(i);
                if (c == '(' || c == '{' || c =='[') {
                    stack.push(c);
                }
                else {
                    if (stack.isEmpty()) return false;
                    if (!matching(stack.peek(), c)) return false;
                    else {
                         stack.pop();
                    }
                }
            }
            return (stack.isEmpty());
        }
    }
    public static void main(String[] args) {
        System.out.println("Balanced Parenthesis Problem ");
        System.out.println("Enter the number of testcases: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       for(int i=0;i<n;i++){
           System.out.println("Enter the expression....of parenthesis (){}[] only.. ");
           String expression=sc.next();
           String ans="is Balanced.";
           if(!isBalanced(expression)){
               ans="is not Balanced.";
           }
           System.out.println("Expression "+expression+" "+ans);
       }
        System.out.println("Thank You!!");
       sc.close();
    }
}
