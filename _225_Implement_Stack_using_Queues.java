import java.util.LinkedList;
import java.util.Queue;

public class _225_Implement_Stack_using_Queues {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>(); 
    }
    
    public void push(int x) {
        if(q1.isEmpty()){
            q1.add(x);
            if(!q2.isEmpty()){
                q1.add(q2.poll());
            }
        }else if(q2.isEmpty()){
            q2.add(x);
            if(!q1.isEmpty()){
                q2.add(q1.poll());
            }
        }
    }
    
    public int pop() {
        if(q1.isEmpty()){
          return q2.peek();
        }
       return q1.peek();
    }
    
    public int top() {
          if(q1.isEmpty()){
           return q2.peek();
        }
       return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}
