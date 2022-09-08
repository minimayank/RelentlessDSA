import java.util.*;
class Solution {
    public static boolean matched(Character a,Character b){
        return (a=='('&&b==')')||
               (a=='{'&&b=='}')||
               (a=='['&&b==']');
    }
    public boolean isValid(String s) {
        if(s.length()%2!=0)return false;
        Deque<Character>stack=new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            
            Character c=s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }
            else{
                if(stack.isEmpty())return false;
                if(!matched(stack.peek(),c)){
                    return false;
                }         
                else{
                    stack.pop();
                }   
                   
            
        }
    }
     return stack.isEmpty();   //samajh aaya..
 }
}
    
