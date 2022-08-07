package StackProblems;
import java.util.Deque;
import java.util.ArrayDeque;
public class RedundantBrackets {
    public static boolean checkRedundantBrackets(String expression){
        if(expression.length()==0)return false;
        Deque<Character>stack=new ArrayDeque<>();
        int countOfUsefulCharacters=0;
        for(int i=0;i<expression.length();i++){
            Character c=expression.charAt(i);
            if(c=='(') {
                countOfUsefulCharacters = 0;
                int j = i;
                while (expression.charAt(j) != ')') {
                    stack.push(expression.charAt(j));
                    if (expression.charAt(j) != '(') {
                        countOfUsefulCharacters++;
                    }
                    i = j;
                    j++;
                }
            }
            if(expression.charAt(i)==')') {
                if (countOfUsefulCharacters == 0) return true;
                else {
                    while (expression.charAt(i) != '(') {
                        stack.pop();
                        countOfUsefulCharacters--;
                    }
                }
            }



        }

        return false;
    }

    public static void main(String[] args) {
        String str1="(a+(b+c))";
        String str2="((a+b))";
        String str3="(a+b)";
        String str4="a+(b+c)";
        System.out.println(checkRedundantBrackets(str1));
    }
}
