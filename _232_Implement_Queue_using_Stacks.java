import java.util.Stack;

public class _232_Implement_Queue_using_Stacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    // time complexity 
   
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    // O(1)
    public void push(int x) {
        stack1.push(x);
    }
    
    // O(n)
    public int pop() {
        if(stack2.isEmpty()){
           while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
           }
        }
        return stack2.pop();
    }
    
    // O(n)
    public int peek() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    
    // O(1)
    public boolean empty() {
       return stack1.isEmpty() && stack2.isEmpty();
    }
    
}
