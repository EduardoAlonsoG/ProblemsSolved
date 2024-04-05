package Stacks;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(new SolutionVP().isValid(s));
    }
}

class SolutionVP {
    public boolean isValid(String s) {
        Stack<Character> buffer = new Stack<Character>();
        for(char n : s.toCharArray()){
            //()[]{}
            switch (n){
                case '}':
                    if(buffer.empty() ) return false;
                    if(buffer.pop() != '{' ) return false;
                    break;
                case ')':
                    if(buffer.empty() ) return false;
                    if(buffer.pop() != '(' ) return false;
                    break;
                case ']':
                    if(buffer.empty() ) return false;
                    if(buffer.pop() != '[' ) return false;
                    break;
                default:
                    buffer.push(n);
                    break;
            }
        }
        return buffer.empty();
    }
}