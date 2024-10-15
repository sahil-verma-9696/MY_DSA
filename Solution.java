import java.util.*;
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        // add your code here
        // Approach - 1
        List<Character> op = Arrays.asList('(','[','{');
        Stack<Character> stk = new Stack<>();
        if(!op.contains(x.charAt(0))) return false;
        for(int i=0; i<x.length(); i++){
            
            Character it = x.charAt(i);
            
            if(op.contains(it)){
                stk.push(it);
            }else if(stk.size()>0){
                switch(it){
                    case ')':
                        if(stk.peek()=='(')
                        stk.pop();
                        else return false;
                        break;
                       
                    case '}':
                        if(stk.peek()=='{')
                        stk.pop();
                        else return false;
                        break;
                        
                    case ']':
                        if(stk.peek()=='[')
                        stk.pop();
                        else return false;
                        break;
                }
            }
        }
        
        return stk.size() == 0?true:false;
    }
}