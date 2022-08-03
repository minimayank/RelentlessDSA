package Revision;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {
    public static boolean matched(Character a, Character b){
        return ( a=='('&& b==')'||
                (a=='{'&& b=='}')||
                (a=='['&& b==']'));
    }
    public static boolean balanacedParenthesisCheck(String input){
        if(input.length()==0)return true;
        else{
            Deque<Character> stack=new  ArrayDeque<>();
            for(int i=0;i<input.length();i++){
                Character x=input.charAt(i);
                if(x=='['||x=='{'||x=='('){
                    stack.push(x);
                }

                else {
                    if (stack.isEmpty()) return false;
                    if (matched(stack.peek(), x) == false) {
                        return false;
                    } else {
                        stack.pop();
                    }
                }
            }
            return (stack.isEmpty());
        }
    }
    public static void main(String[] args) {
        String input="((({}))";
        System.out.println(balanacedParenthesisCheck(input));
    }
}
