package StackProblems;
import java.awt.*;
import java.util.Deque;
import java.util.ArrayDeque;

public class CheckRedundantBracekts {
//    public static boolean redundancyTest(String expression){
//        if(expression.length()==0)return true;
//        Deque<Character>stack=new ArrayDeque<>();
//        int countOfOperation=0;
//        for(int i=0;i<expression.length();i++){
//            int j=i;
//            countOfOperation=0;
//            while(expression.charAt(j)!=')'){
//                stack.push(expression.charAt(j));
//                if(expression.charAt(j)!='('){
//                    countOfOperation++;
//                }
//                j++;
//                i=j;
//            }
//            while(!stack.isEmpty()&&stack.peek()!='('){
//                stack.pop();
//             //   countOfOperation--;
//            }
//            stack.pop();
//
//
//        }
//        return (countOfOperation==0);
//    }

//    public static boolean redundancyTest(String expression){
//        if(expression.length()==0)return false;
//        else{
//            int content=0;
//            Deque<Character>stack=new ArrayDeque<>();
//            for(int i=0;i<expression.length();i++){
//                if(expression.charAt(i)=='('){
//                    stack.push(expression.charAt(i));
//                    int j=i+1;
//                    content=0;
//                    while(expression.charAt(j)!=')'){
//                        if(expression.charAt(j)!='('){
//                            content++;
//                        }
//                        stack.push(expression.charAt(j));
//
//                        i=j++;
//
//                    }
//                    else if(expression.charAt(i)!=')'){
//
//                    }
//                }
//
//            }
//        }

    public static void main(String[] args) {
        String str1="(a+(b+c))";
        String str2="((a+b))";
        String str3="(a+b)";
        String str4="a+(b+c)";


        //System.out.println(redundancyTest(str1));

    }
}
