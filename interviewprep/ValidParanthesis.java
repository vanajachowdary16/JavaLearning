package interviewprep;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args){

        String input = "()";
        System.out.println(checkParanthesis(input));

    }

    private static boolean checkParanthesis(String input) {
        // TODO Auto-generated method stub
        char[] inputArr = input.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for(char ch : inputArr){
            if( ch == '('){
                stack.push(ch);
            } else {
                if(ch==')'){
                    if(stack.isEmpty()){
                        return false;   
                    } else {
                        char top =stack.pop();
                        if(top != '('){
                            return false;
                    }
                }
            }
        }

        
    }
    
}
