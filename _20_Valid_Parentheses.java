// import java.util.Stack;

public class _20_Valid_Parentheses {
    //solution 1
    // public boolean isValid(String s) {
    //     Stack<Character> stack = new Stack<Character>();
    //     for (char c : s.toCharArray()) {
    //         if (c == '(')
    //             stack.push(')');
    //         else if (c == '{')
    //             stack.push('}');
    //         else if (c == '[')
    //             stack.push(']');
    //         else if (stack.isEmpty() || stack.pop() != c)
    //             return false;
    //     }
    //     return stack.isEmpty();
    // }

    //solution 2
    // public boolean isValid(String s) {
    //     Stack<Character> stack = new Stack<Character>();
        
    //     for(char c : s.toCharArray()){
    //         if(c == '(' || c == '{' || c == '['){
    //             stack.add(c);
    //         }else{
    //             if(stack.isEmpty()){
    //                 return false;
    //             }
    
    //             if(c == ')'){
    //                 if(stack.pop() != '(')
    //                 return false;
    //             }else if(c == '}'){
    //                 if(stack.pop() != '{')
    //                 return false;
    //             }else if(c == ']'){
    //                 if(stack.pop() != '[')
    //                 return false;
    //             }
    //         }
    //     }
    //     return stack.isEmpty();
    // }
}
