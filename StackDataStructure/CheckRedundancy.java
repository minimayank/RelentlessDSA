import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class CheckRedundancy {
    public static boolean operators(Character c){
        return (c=='*'||c=='-'||c=='+'||c=='/');
    }
    public static boolean isRedundant(String expression){
         boolean ans=false;
        if(expression.length()==0)return false;
        Deque<Character>stack=new ArrayDeque<Character>();
       
        for(int i=0;i<expression.length();i++) {
            if (expression.charAt(i) == '(' || operators(expression.charAt(i))) {
                stack.push(expression.charAt(i));

            }
                if (stack.peek() == '(' && expression.charAt(i) == ')') ans= true;
                else {
                    if(expression.charAt(i)==')') {
                        while (stack.peek() != '(') {
                            stack.pop();
                        }

                        stack.pop();
                    }
                }
            }
        
           return (ans);
        }

    public static void main(String[] args) {
        System.out.println("Test for expression redundancy.. in O(n)"+
                "\n Redundancy in an expression means that there is an unnecessary usage of brackets in a expression."+
                "\n eg. (a+b)// here there is no redundancy."+
                "\n eg. ((A+B))// here there is a redundancy as the second bracket has no use."+
                "\n eg. (a)+(a+b*c)// here again there is redundancy as (a) is having unnecessary bracket. "+
                "\n thumb rule is to check whether there an operation (*,+,-,/) or not inside the bracket");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of test cases.");
        int t=sc.nextInt();
       for(int i=0;i<t;i++){
           String expression=sc.next();
           if(isRedundant(expression)){
               System.out.println("Expression: "+expression+" is Redundant.");
           }
           else{
               System.out.println("Expression; "+expression+" is not Redundant.");
           }


       }
    }
}
